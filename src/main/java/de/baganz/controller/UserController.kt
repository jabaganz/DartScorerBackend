package de.baganz.controller

import de.baganz.dao.User
import de.baganz.repositories.UserRepository
import de.baganz.utils.IdCounter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/user")
open class UserController {

    @Autowired
    lateinit var repo: UserRepository

    @Autowired
    lateinit var idCounter: IdCounter
    
    open fun create(@PathVariable name: String): User {

        var user: User? = repo.findUserByName(name)

        if (user == null) {
            user = User(name, idCounter.getNextIdFor("user"))
        }

        return user
    }

    @RequestMapping("/delete/{id}")
    fun delete(@PathVariable id: Long) {
        repo.delete(id)
    }


    @RequestMapping("/scorings")
    fun getAllScorings() {

    }


}