package feedbackprocessor.service

class FeedbackProcessorImpl : FeedbackProcessor {

    override fun processFedback(name: String): String {
        println(name)

        return "Happy Days!"
    }
}