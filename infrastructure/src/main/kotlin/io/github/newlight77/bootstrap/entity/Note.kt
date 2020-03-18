package io.github.newlight77.bootstrap.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Note(@Id @GeneratedValue var id: Long? = null,
                var title: String? = null,
                var text: String? = null,
                @JsonIgnore var user: String? = null)