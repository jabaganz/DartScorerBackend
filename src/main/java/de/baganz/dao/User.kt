package de.baganz.dao

import com.fasterxml.jackson.annotation.JsonCreator
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.hateoas.ResourceSupport


/**
 * Created by baganz on 26.06.17.
 */


@Document(collection = "user")
class User @JsonCreator constructor(
        var name:String,
        @Id
        var id:Long
) : ResourceSupport()