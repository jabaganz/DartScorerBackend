package de.baganz.service

import de.baganz.dao.Score
import de.baganz.dao.User

/**
 * Created by baganz on 30.06.17.
 */



interface GameInterface{


    fun playerThrow(player:User,score:Score)

    fun undoLastPLayerThrow(player: User)

    fun redoLastPlayerThrow(player: User)

    fun getPossibleFinishes(player: User):List<List<Score>>{

        return emptyList()
    }


}