package de.baganz.controller


import de.baganz.dao.DartGame
import de.baganz.dao.Game301
import de.baganz.repositories.DartGameRepository
import de.baganz.utils.IdCounter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpEntity
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.streams.toList


@RestController
@RequestMapping("/game")
open class DartGameController {

    @Autowired
    lateinit var dartGameRepo: DartGameRepository

    @Autowired
    lateinit var userController: UserController

    @Autowired
    lateinit var idCounter: IdCounter

    var currentGame: DartGame? = null


    @RequestMapping("/newGame/301/{player}/{points}/{doubleOut}")
    open fun createNewGame(@PathVariable player: Array<String>,
                           @PathVariable points: Int,
                           @PathVariable doubleOut: Boolean): HttpEntity<DartGame> {

        val users = ArrayList(player.asList().stream().map { i -> userController.create(i) }.toList())
        currentGame =   Game301(idCounter.getNextIdFor("Game301"), users.toTypedArray(), points, doubleOut)
        return ResponseEntity<DartGame>(currentGame, HttpStatus.OK)
    }

    @RequestMapping("/loadGame/{gameId}")
    open fun loadSavedGame(@PathVariable gameId:Int){

    }

    open fun saveGame() {
        if (currentGame ==null) {
            dartGameRepo.save(currentGame)
        }
    }


    @RequestMapping("/score/{player}/{points}/{modifier}")
    open fun score(@PathVariable player: String,
                   @PathVariable points: Int,
                   @PathVariable modifier: String): ResponseEntity<String> {

        return ResponseEntity("Scoooooore", HttpStatus.OK)
    }

    @RequestMapping("/remainingPoints")
    open fun getPlayerRemainingPoints() {
    }

}