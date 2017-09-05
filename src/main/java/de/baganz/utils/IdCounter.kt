package de.baganz.utils

import de.baganz.dao.CustomSequence
import de.baganz.repositories.SequenceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Service

/**
 * Created by baganz on 03.07.17.
 */

@Service
open class IdCounter {

    @Autowired
    lateinit var sequenceRepo: SequenceRepository

    open fun getNextIdFor(sequenceName: String): Long {
        val seq: CustomSequence? = sequenceRepo.findOne(sequenceName)
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