package de.baganz.dao

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by baganz on 27.06.17.
 */

@Document
open class Score(
        @Id
        var Id : Long,
        var user : User,
        var game : DartGame,
        var multiplier: String ,
        var value :  Int
)