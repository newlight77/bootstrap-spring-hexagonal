package io.github.newlight77.bootstrap.note.service

import io.github.newlight77.bootstrap.note.api.INoteRepository
import io.github.newlight77.bootstrap.note.api.INoteService
import io.github.newlight77.bootstrap.note.model.NoteDomain

class NoteService(private var repository: INoteRepository<NoteDomain, Long>) : INoteService<NoteDomain, Long> {
    override fun save(domain: NoteDomain) {
        repository.save(domain)
    }

    override fun findAll(): List<NoteDomain> {
        return repository.findAll()
    }

    override fun findAllByUser(name: String): List<NoteDomain> {
        return repository.findAllByUser(name)
    }

}