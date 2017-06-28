package de.baganz.repositories

import de.baganz.dao.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

/**
 * Created by baganz on 26.06.17.
 */

@Repository
interface UserRepository : MongoRepository<User, String> {
}