package io.github.newlight77.bootstrap.api

interface NotesRepository<T, U> {
    fun save(note: T)
    fun findAll(): List<T>
    fun findAllByUser(name: String): List<T>
}