package dev.sauve.happening.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("todos")
data class Todo (
    @Id
    val id: ObjectId = ObjectId(),
    val todo: String = "",
    val completed: Boolean = false,
)