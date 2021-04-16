
def checkout(branch) {

    script {

        try {

            echo "checking out:${branch}"

            sh "git branch --l"

            //sh "exit 1"

            sh "${JOB_NAME} - ${currentStage}"

        } catch (Exception e) {

            echo "found Exception...."
            CheckoutException ce = new CheckoutException("error during checkout", "Federico")
            ce.getOut("Federico")
            echo "end manage excepotion"

        }

    }

}


class CheckoutException extends Exception {

    public CheckoutException(message, name) {

        super(message)

    }

    public getOut(name) {
        

    }

}