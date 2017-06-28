package de.baganz.service

import de.baganz.repositories.UserRepository
import de.baganz.dao.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct


@Service
class MyService(){

    @Autowired
    lateinit var repo : UserRepository



    @PostConstruct
    fun init(){
        repo.save(User("Jan",1))
        repo.save(User("Sarah",2))
    }

}