package feedbackprocessor

import feedbackprocessor.service.FeedbackProcessor
import feedbackprocessor.service.FeedbackProcessorImpl
import io.micronaut.context.annotation.ConfigurationProperties
import io.micronaut.function.FunctionBean
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Consumes
import java.util.function.Function

@FunctionBean("feedbackprocessor")
class FeedbackprocessorFunction : Function<FeedbackRequest, MutableHttpResponse<String>?> {

    lateinit var feedbackProcessor: FeedbackProcessor

    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    override fun apply(req: FeedbackRequest): MutableHttpResponse<String>? {
        feedbackProcessor = FeedbackProcessorImpl()

        return  HttpResponse.ok<String>()
                .contentType(MediaType.TEXT_PLAIN)
                .body(feedbackProcessor.processFedback(req.name))
    }
}