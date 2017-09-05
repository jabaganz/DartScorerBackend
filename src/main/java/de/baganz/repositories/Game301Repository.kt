package de.baganz.repositories

import de.baganz.dao.Game301
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * Created by baganz on 30.06.17.
 */

@Repository
interface Game301Repository : CrudRepository<Game301, Long>

