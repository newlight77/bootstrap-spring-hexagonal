package io.github.newlight77.bootstrap.note.api

import io.github.newlight77.bootstrap.note.model.NoteDomain
import io.github.newlight77.bootstrap.note.model.NoteModel
import io.github.newlight77.bootstrap.note.model.toDomain
import io.github.newlight77.bootstrap.note.service.INoteService
import org.springframework.http.HttpStatus
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/notes")
class NoteApi(val noteService: INoteService<NoteDomain, Long>) {

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    fun createNote(@RequestBody note: NoteModel) {
        println(note)
        noteService.save(toDomain(note))
    }
}