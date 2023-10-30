package dev.sauve.happening.repositories

import dev.sauve.happening.models.Todo
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*



interface TodoRepository : MongoRepository<Todo, String> {
//    override fun findById(id: String) : Optional<Todo>
    //fun findAllTodos(): ArrayList<Todo>

}