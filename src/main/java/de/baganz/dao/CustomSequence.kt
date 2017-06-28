package de.baganz.dao

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by baganz on 28.06.17.
 */

@Document
open class CustomSequence(
        @Id
        var id : String,
        var seq : Long

)