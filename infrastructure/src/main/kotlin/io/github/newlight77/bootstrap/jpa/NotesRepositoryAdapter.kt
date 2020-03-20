package io.github.newlight77.bootstrap.jpa

import io.github.newlight77.bootstrap.api.NotesRepository
import io.github.newlight77.bootstrap.entity.Note
import org.springframework.stereotype.Repository

@Repository
class NotesRepositoryAdapter(private var notesJpaRepository: NotesJpaRepository) : NotesRepository<Note, Long> {
    override fun findAllByUser(name: String): List<Note> {
        return notesJpaRepository.findAllByUser(name)
    }
}





