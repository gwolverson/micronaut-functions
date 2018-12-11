package example

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.jupiter.api.Assertions.assertEquals


class FeedbackformFunctionTest: Spek({

    describe("feedbackform function") {
        val server = ApplicationContext.run(EmbeddedServer::class.java)
        val client = server.applicationContext.getBean(FeedbackformClient::class.java)

        it("should return 'feedbackform'") {
            assertEquals(client.index().blockingGet(), "feedbackform")
        }

        afterGroup {
            server.stop()
        }
    }
})
