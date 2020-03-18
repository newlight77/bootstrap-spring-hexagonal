package io.github.newlight77.bootstrap.config

import io.github.newlight77.bootstrap.entity.Note
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer

@Configuration
class RestConfiguration : RepositoryRestConfigurer {
   override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration?) {
        config?.exposeIdsFor(Note::class.java)
       config?.setBasePath("/api")
   }
}