package de.baganz.repositories

import com.mongodb.Mongo
import de.baganz.dao.CustomSequence
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

/**
 * Created by baganz on 28.06.17.
 */

@Repository
interface SequenceRepository : MongoRepository<CustomSequence, String> {

}