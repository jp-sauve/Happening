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
@RequestMapping("/todos")
class TodosWebController(private val repository: TodoRepository) {

    @GetMapping("", )
    fun allTodos(model: Model): String {
        model["title"] = "All Todos"
        model["todos"] = repository.findAll()
        return "todos"
    }
    @GetMapping("/{slug}")
    fun todo(@PathVariable slug: String, model: Model): String {
        val todo = repository
            .findById(slug).get()
            ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "This article does not exist")
        model["title"] = "Take This Todo and Shove It"
        model["todo"] = todo.todo
        model["completed"] = todo.completed
        return "todo"
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/todos")
    fun addTodo(model: Model): String {
        return "todo"
    }
}