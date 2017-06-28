package de.baganz.controller

import de.baganz.MongoDbRepository
import de.baganz.dao.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController



@RestController
@RequestMapping("/user")
open class UserController{

    @Autowired
    lateinit var repo : MongoDbRepository;


    @RequestMapping("/createUser")
    fun create(name: String) : Long {
        repo.save(User(name,12))
        return 12
    }

    fun delete(){

    }

    @RequestMapping("scorings")
    fun getAllScorings(){

    }


}