package de.baganz.dao

import org.springframework.hateoas.ResourceSupport


open class Score(
        var multiplier: Multiplier ,
        var value :  Int
) : ResourceSupport()

enum class Multiplier{
        NONE,
        DOUBLE,
        TRIPLE
}