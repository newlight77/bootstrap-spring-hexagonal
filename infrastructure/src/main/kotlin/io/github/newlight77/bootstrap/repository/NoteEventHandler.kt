package io.github.newlight77.bootstrap.repository

import io.github.newlight77.bootstrap.entity.Note
import org.springframework.data.rest.core.annotation.HandleBeforeCreate
import org.springframework.data.rest.core.annotation.RepositoryEventHandler
import org.springframework.stereotype.Component

@Component
@RepositoryEventHandler(Note::class)
class NoteEventHandler {
    @HandleBeforeCreate
    fun handleCreate(note: Note) {
        println("Creating note: $note")
    }
}