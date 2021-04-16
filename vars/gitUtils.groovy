
def checkout(branch) {

    script {

        try {

            echo "checking out:${branch}"

            sh "git branch --l"

            sh "exit 1"

        } catch (Exception e) {

            throw new CheckoutException("error during checkout", "Federico")

        }

    }

}


class CheckoutException extends Exception {

    public CheckoutException(message, name) {

        super(message)
        println name

    }

}