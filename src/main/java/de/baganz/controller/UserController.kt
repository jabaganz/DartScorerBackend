package de.baganz.controller

import de.baganz.repositories.UserRepository
import de.baganz.dao.CustomSequence
import de.baganz.dao.User
import de.baganz.repositories.SequenceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.print.DocFlavor


@RestController
@RequestMapping("/user")
open class UserController {

    @Autowired
    lateinit var repo: UserRepository

    @Autowired
    lateinit var sequenceRepo: SequenceRepository


    @RequestMapping("/createUser")
    fun create(@RequestParam(value = "name") name: String): Long {
        var id = getNextIdFor("user");
        repo.save(User(name, id))
        return id
    }

    fun delete() {

    }

    @RequestMapping("/scorings")
    fun getAllScorings() {

    }

    fun getNextIdFor(sequenceName: String): Long {
        var seq: CustomSequence? = sequenceRepo.findOne(sequenceName)
        if (seq != null) {
            seq.seq += 1;
            sequenceRepo.save(seq)
            return seq.seq
        } else {
            sequenceRepo.save(CustomSequence(sequenceName, 0))
            return 0
        }
    }


}