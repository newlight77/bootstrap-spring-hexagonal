package io.github.newlight77.bootstrap.user.api

import io.github.newlight77.bootstrap.note.api.INoteRepository
import io.github.newlight77.bootstrap.note.model.NoteDomain
import io.github.newlight77.bootstrap.note.model.NoteModel
import io.github.newlight77.bootstrap.note.model.fromDomain
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

@RestController
@RequestMapping("users")
class UserApi(val repository: INoteRepository<NoteDomain, Long>) {

    @GetMapping("/notes")
    fun notes(principal: Principal): List<NoteModel> {
        println("Fetching notes for user: ${principal.name}")
        val notes = repository.findAllByUser(principal.name)
        return if (notes.isEmpty()) {
            listOf()
        } else {
            notes.map { fromDomain(it) }
        }
    }
}