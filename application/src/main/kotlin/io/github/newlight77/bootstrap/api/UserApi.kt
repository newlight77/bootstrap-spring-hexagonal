package io.github.newlight77.bootstrap.api

import io.github.newlight77.bootstrap.entity.Note
import io.github.newlight77.bootstrap.jpa.NotesRepositoryAdapter
//import io.github.newlight77.bootstrap.model.Note
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

@RestController
@RequestMapping("api")
class UserApi(val repository: NotesRepositoryAdapter) {

    @GetMapping("/user/notes")
    fun notes(principal: Principal): List<Note> {
        println("Fetching notes for user: ${principal.name}")
        val notes = repository.findAllByUser(principal.name)
        return if (notes.isEmpty()) {
            listOf()
        } else {
            notes
        }
    }
}