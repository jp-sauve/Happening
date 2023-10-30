package dev.sauve.happening.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("user")
data class User (
    @Id
    val id: ObjectId = ObjectId(),
    val firstname: String,
    val lastname: String,
    val username: String,
)