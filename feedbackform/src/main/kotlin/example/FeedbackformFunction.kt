package example

import example.service.FeedbackFormGenerator
import example.service.FeedbackFormGeneratorImpl
import io.micronaut.function.FunctionBean
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.MutableHttpResponse
import java.util.function.Supplier

@FunctionBean("feedbackform")
class FeedbackformFunction : Supplier<MutableHttpResponse<String>> {

    lateinit var feedbackformGenerator : FeedbackFormGenerator

    override fun get(): MutableHttpResponse<String> {
        feedbackformGenerator = FeedbackFormGeneratorImpl()

        return HttpResponse.ok<String>()
                .contentType(MediaType.TEXT_HTML_TYPE)
                .body(feedbackformGenerator.generateFeedbackForm())
    }
}