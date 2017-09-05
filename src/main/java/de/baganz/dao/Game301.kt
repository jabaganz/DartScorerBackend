package de.baganz.dao

import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by baganz on 29.06.17.
 */


@Document
open class Game301 constructor(
        Id: Long,
        players: Array<User>,
        var requiredPoints: Int = 501,
        var doubleOut: Boolean = true
) : DartGame(Id, players, false, emptyArray<Score>())

