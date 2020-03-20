package io.github.newlight77.bootstrap.jpa

import io.github.newlight77.bootstrap.entity.NoteEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "note", path = "notes")
interface NotesJpaRepository : JpaRepository<NoteEntity, Long> {
    fun save(entity: NoteEntity)
    override fun findAll(): List<NoteEntity>
    fun findAllByUser(name: String): List<NoteEntity>
}





