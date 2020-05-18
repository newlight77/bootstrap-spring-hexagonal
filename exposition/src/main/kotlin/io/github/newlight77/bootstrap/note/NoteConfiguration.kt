package io.github.newlight77.bootstrap.note

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class NoteConfiguration {
    @Bean
    fun noteService(repository: INoteRepository<NoteDomain, Long>): INoteService {
        println("bean noteService")
        return NoteService(repository)
    }
}