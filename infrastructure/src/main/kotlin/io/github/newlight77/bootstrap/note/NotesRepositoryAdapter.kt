package io.github.newlight77.bootstrap.note

import org.springframework.stereotype.Repository

@Repository
class NotesRepositoryAdapter(private var notesJpaRepository: NotesJpaRepository) : INoteRepository<NoteDomain, Long> {
    override fun save(note: NoteDomain): NoteDomain {
        return fromEntity(notesJpaRepository.save(toEntity(note)))
    }

    override fun findAll(): List<NoteDomain> {
        return notesJpaRepository.findAll().map {
            fromEntity(it)
        }
    }

    override fun findAllByUser(name: String): List<NoteDomain> {
        return notesJpaRepository.findAllByUser(name).map {
            fromEntity(it)
        }
    }
}





