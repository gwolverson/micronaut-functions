package feedbackprocessor

import io.micronaut.function.client.FunctionClient
import io.reactivex.Single
import javax.inject.Named

@FunctionClient
interface FeedbackprocessorClient {

    @Named("feedbackprocessor")
    fun index(): Single<String>

}
