package com.roshanadke.plugins

import com.roshanadke.routes.randomRabbit
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    
    routing {

        randomRabbit()
        get("/") {
            call.respondText("Hello World!")

        }
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
