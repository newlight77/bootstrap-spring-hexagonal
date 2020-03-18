package io.github.newlight77.bootstrap.api

interface NotesRepository<T, U> {
    fun findAllByUser(name: String): List<T>
}