package feedbackprocessor.service

interface FeedbackProcessor {

    fun processFedback(name: String): String
}