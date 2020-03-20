package io.github.newlight77.bootstrap.api

import io.github.newlight77.bootstrap.model.NoteDomain
import io.github.newlight77.bootstrap.model.NoteModel
import io.github.newlight77.bootstrap.model.toDomain
import org.springframework.http.HttpStatus
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/notes")
class NoteApi(val repository: NotesRepository<NoteDomain, Long>) {

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    fun createNote(@RequestBody note: NoteModel) {
        println(note)
        repository.save(toDomain(note))
    }
}