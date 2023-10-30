package dev.sauve.happening.controllers.web

import dev.sauve.happening.models.Todo
import dev.sauve.happening.repositories.TodoRepository
import org.springframework.data.repository.query.Param
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.server.ResponseStatusException
import kotlin.jvm.optionals.getOrNull

@Controller
@RequestMapping("/")
class WebController(private val repository: TodoRepository) {

    @GetMapping("")
    fun getIndex(@RequestParam(name="name", required = false, defaultValue = "World") name: String, model: Model): String {
        model["name"] = name
        return "index"
    }


}