package io.github.newlight77.bootstrap.note.service

interface INoteService<T, U> {
    fun save(note: T)
    fun findAll(): List<T>
    fun findAllByUser(name: String): List<T>
}