package io.github.newlight77.bootstrap.note

import org.springframework.stereotype.Component

@Component
class NoteApiHandler(private var noteServiceAdapter: NoteServiceAdapter) {
    fun create(note: NoteModel) {
        noteServiceAdapter.save(note)
    }

    fun findAllByUser(username: String): List<NoteModel> {
        return noteServiceAdapter.findAllByUser(username)
    }
}