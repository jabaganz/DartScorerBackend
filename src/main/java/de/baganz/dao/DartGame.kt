package de.baganz.dao

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.hateoas.ResourceSupport


@Document
open class DartGame(
        @Id
        var Id: Long,
        var players: Array<User>,
        var isFinished: Boolean = false,
        var scores: Array<Score> = arrayOf<Score>()
) : ResourceSupport()