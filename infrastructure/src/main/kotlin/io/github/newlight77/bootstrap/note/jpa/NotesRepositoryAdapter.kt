package io.github.newlight77.bootstrap.note.jpa

import io.github.newlight77.bootstrap.note.port.INoteRepository
import io.github.newlight77.bootstrap.note.entity.fromDomain
import io.github.newlight77.bootstrap.note.model.NoteDomain
import io.github.newlight77.bootstrap.note.entity.toDomain
import org.springframework.stereotype.Repository

@Repository
class NotesRepositoryAdapter(private var notesJpaRepository: NotesJpaRepository) : INoteRepository<NoteDomain, Long> {
    override fun save(note: NoteDomain) {
        println(note)
        notesJpaRepository.save(fromDomain(note))
    }

    override fun findAll(): List<NoteDomain> {
        return notesJpaRepository.findAll().map {
            toDomain(it)
        }
    }

    override fun findAllByUser(name: String): List<NoteDomain> {
        return notesJpaRepository.findAllByUser(name).map {
            toDomain(it)
        }
    }
}





