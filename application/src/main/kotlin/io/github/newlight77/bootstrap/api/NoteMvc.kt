package io.github.newlight77.bootstrap.api

import io.github.newlight77.bootstrap.model.NoteDomain
import io.github.newlight77.bootstrap.model.NoteModel
import io.github.newlight77.bootstrap.model.toDomain
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping


@Controller
@RequestMapping("/notes")
class NoteMvc(val repository: NotesRepository<NoteDomain, Long>) {
    @GetMapping("")
    fun notes(model: Model): String {
        model.addAttribute("notes", repository.findAll());
        return "notes";
    }
}