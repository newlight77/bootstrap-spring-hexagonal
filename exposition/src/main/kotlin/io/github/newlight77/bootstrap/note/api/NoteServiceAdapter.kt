package io.github.newlight77.bootstrap.note.api

import io.github.newlight77.bootstrap.note.model.NoteDomain
import io.github.newlight77.bootstrap.note.model.NoteModel
import io.github.newlight77.bootstrap.note.model.fromDomain
import io.github.newlight77.bootstrap.note.model.toDomain
import io.github.newlight77.bootstrap.note.service.INoteService
import org.springframework.stereotype.Service

@Service
class NoteServiceAdapter(private var service: INoteService<NoteDomain, Long>) : INoteService<NoteModel, Long> {
    override fun save(note: NoteModel) {
        service.save(toDomain(note))
    }

    override fun findAll(): List<NoteModel> {
        return service.findAll().map { fromDomain(it) };
    }

    override fun findAllByUser(name: String): List<NoteModel> {
        return service.findAllByUser(name).map { fromDomain(it) };
    }
}