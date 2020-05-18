package io.github.newlight77.bootstrap.note

class NoteService(private var repository: INoteRepository<NoteDomain, Long>) : INoteService {
    override fun save(note: NoteDomain) {
        repository.save(note)
    }

    override fun findAll(): List<NoteDomain> {
        return repository.findAll()
    }

    override fun findAllByUser(name: String): List<NoteDomain> {
        return repository.findAllByUser(name)
    }
}