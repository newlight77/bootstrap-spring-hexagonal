package io.github.newlight77.bootstrap.note

import org.springframework.stereotype.Service

@Service
class NoteServiceAdapter(private var service: INoteService) {
    fun save(note: NoteModel) {
        service.save(fromModel(note))
    }

    fun findAllByUser(name: String): List<NoteModel> {
        return service.findAllByUser(name).map { toModel(it) };
    }

    fun findAll(): List<NoteModel> {
        return service.findAll().map { toModel(it) };
    }
}