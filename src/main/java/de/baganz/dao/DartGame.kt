package de.baganz.dao

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document
open class DartGame(
        @Id
        var Id: Long,
        var players : Array<User>,
        var isFinished : Boolean,
        var score : Array<Score>
)