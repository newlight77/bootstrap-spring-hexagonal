package io.github.newlight77.bootstrap.note

interface INoteRepository<T, U> {
    fun save(note: T): T
    fun findAll(): List<T>
    fun findAllByUser(name: String): List<T>
}