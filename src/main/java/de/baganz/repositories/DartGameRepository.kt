package de.baganz.repositories

import de.baganz.dao.DartGame
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * Created by baganz on 29.06.17.
 */

@Repository
interface DartGameRepository : CrudRepository<DartGame, Long>