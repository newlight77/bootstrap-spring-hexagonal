package io.github.newlight77.bootstrap.note.config

import io.github.newlight77.bootstrap.note.port.INoteRepository
import io.github.newlight77.bootstrap.note.service.INoteService
import io.github.newlight77.bootstrap.note.model.NoteDomain
import io.github.newlight77.bootstrap.note.service.NoteService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class NoteConfiguration {
    @Bean
    fun noteService(repository: INoteRepository<NoteDomain, Long>): INoteService<NoteDomain, Long> {
        println("bean noteService")
        return NoteService(repository)
    }
}