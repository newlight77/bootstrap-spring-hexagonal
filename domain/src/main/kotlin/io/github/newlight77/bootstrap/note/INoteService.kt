package io.github.newlight77.bootstrap.note

interface INoteService {
    fun save(note: NoteDomain)
    fun findAll(): List<NoteDomain>
    fun findAllByUser(name: String): List<NoteDomain>
}