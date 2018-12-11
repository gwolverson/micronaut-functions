package example.service

import kotlinx.html.*
import kotlinx.html.stream.appendHTML


class FeedbackFormGeneratorImpl : FeedbackFormGenerator {

    override fun generateFeedbackForm(): String {
        val result = buildString {
            appendln("<!DOCTYPE html>")
            appendHTML().html {
                body {
                    form {
                        name = "feedbackForm"
                        id = "feedbackform"
                        method = FormMethod.post
                        action = "http://localhost:8082/feedbackprocessor"
                        encType = FormEncType.applicationXWwwFormUrlEncoded

                        input {
                            type = InputType.text
                            name = "name"
                            placeholder = "Enter name"
                        }

                        button {
                            value = "submit"
                            name = "Submit"
                            text("Submit")
                        }
                    }
                }
            }
        }

        return result
    }
}