package feedbackprocessor

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("feedbackprocessor")
                .mainClass(Application.javaClass)
                .start()
    }
}