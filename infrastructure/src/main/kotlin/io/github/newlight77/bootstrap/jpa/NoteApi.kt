package io.github.newlight77.bootstrap.jpa

import io.github.newlight77.bootstrap.api.NotesRepository
import io.github.newlight77.bootstrap.entity.Note
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface NotesRepositoryImpl : NotesRepository<Note, Long>, JpaRepository<Note, Long> {
    override fun findAllByUser(name: String): List<Note>
}





