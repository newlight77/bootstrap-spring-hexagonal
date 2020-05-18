package io.github.newlight77.bootstrap.note

import org.springframework.http.HttpStatus
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.*
import java.security.Principal


@RestController
@RequestMapping("api/notes")
class NoteApi(val noteWebHandler: NoteApiHandler) {

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    fun createNote(@RequestBody note: NoteModel) {
        noteWebHandler.create(note)
    }

    @GetMapping("")
    fun notes(principal: Principal): List<NoteModel> {
        println("Fetching notes for user: ${principal.name}")
        return noteWebHandler.findAllByUser(principal.name)
    }
}