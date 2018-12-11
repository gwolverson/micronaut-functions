package example

import io.micronaut.function.client.FunctionClient
import io.reactivex.Single
import javax.inject.Named

@FunctionClient
interface FeedbackformClient {

    @Named("feedbackform")
    fun index(): Single<String>

}
