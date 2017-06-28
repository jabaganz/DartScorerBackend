package de.baganz.dao

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


/**
 * Created by baganz on 26.06.17.
 */


@Document(collection = "user")
class User(
        var name:String,
        @Id
        var id:Long
)