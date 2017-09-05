package de.baganz.service

import de.baganz.dao.Game301
import de.baganz.dao.Multiplier
import de.baganz.dao.Score
import de.baganz.dao.User
import de.baganz.repositories.DartGameRepository
import de.baganz.repositories.Game301Repository
import org.springframework.beans.factory.annotation.Autowired

/**
 * Created by baganz on 30.06.17.
 */


open abstract class GameInterface301(scoreToHave: Int, doubleOut: Boolean) : GameInterface {


    @Autowired
    lateinit var gameRepo: Game301Repository

    var currentGame: Game301? = null

    fun loadGame(id: Long) {
        currentGame = gameRepo.findOne(id)
    }

    fun getRemainingPlayerScore(player:User):Int{return  0}



}


