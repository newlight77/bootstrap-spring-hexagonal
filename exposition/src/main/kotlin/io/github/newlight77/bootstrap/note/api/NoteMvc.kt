package io.github.newlight77.bootstrap.note.api

import io.github.newlight77.bootstrap.note.model.NoteDomain
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping


@Controller
@RequestMapping("/notes")
class NoteMvc(val noteService: INoteService<NoteDomain, Long>) {
    @GetMapping("")
    fun notes(model: Model): String {
        model.addAttribute("notes", noteService.findAll());
        return "notes";
    }
}