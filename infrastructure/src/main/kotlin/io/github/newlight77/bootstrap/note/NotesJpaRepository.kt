package io.github.newlight77.bootstrap.note

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer

@RepositoryRestResource(collectionResourceRel = "note", path = "notes")
interface NotesJpaRepository : JpaRepository<NoteEntity, Long> {
    fun save(entity: NoteEntity): NoteEntity
    override fun findAll(): List<NoteEntity>
    fun findAllByUser(name: String): List<NoteEntity>
}

@Configuration
class RestConfiguration : RepositoryRestConfigurer {
    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration?) {
        config?.exposeIdsFor(NoteEntity::class.java)
        config?.setBasePath("/rest")
    }
}





