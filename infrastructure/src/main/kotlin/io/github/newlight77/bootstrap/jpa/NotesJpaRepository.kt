package io.github.newlight77.bootstrap.jpa

import io.github.newlight77.bootstrap.entity.Note
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface NotesJpaRepository : JpaRepository<Note, Long> {
    fun findAllByUser(name: String): List<Note>
}





