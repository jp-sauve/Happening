package dev.sauve.happening.repositories

import dev.sauve.happening.models.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, Long> {
    fun findByUsername(login: String): User?
}