package feedbackprocessor

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.jupiter.api.Assertions.assertEquals


class FeedbackprocessorFunctionTest: Spek({

    describe("feedbackprocessor function") {
        val server = ApplicationContext.run(EmbeddedServer::class.java)
        val client = server.applicationContext.getBean(FeedbackprocessorClient::class.java)

        it("should return 'feedbackprocessor'") {
            assertEquals(client.index().blockingGet(), "feedbackprocessor")
        }

        afterGroup {
            server.stop()
        }
    }
})
