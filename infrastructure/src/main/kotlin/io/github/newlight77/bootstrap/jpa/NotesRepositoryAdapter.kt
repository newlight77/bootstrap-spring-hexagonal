package io.github.newlight77.bootstrap.jpa

import io.github.newlight77.bootstrap.api.NotesRepository
import io.github.newlight77.bootstrap.entity.fromDomain
import io.github.newlight77.bootstrap.model.NoteDomain
import io.github.newlight77.bootstrap.entity.toDomain
import org.springframework.stereotype.Repository

@Repository
class NotesRepositoryAdapter(private var notesJpaRepository: NotesJpaRepository) : NotesRepository<NoteDomain, Long> {
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





