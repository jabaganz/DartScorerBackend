package de.baganz.config

import com.mongodb.Mongo
import com.mongodb.MongoClient
import org.springframework.data.mongodb.config.AbstractMongoConfiguration

/**
 * Created by baganz on 28.06.17.
 */


open class SimpleMongoConfig : AbstractMongoConfiguration(){


    override fun mongo(): Mongo {
        return MongoClient("localhost")
    }

    override fun getDatabaseName(): String {
        return "user"
    }
}