package io.github.newlight77.bootstrap.model

import com.fasterxml.jackson.annotation.JsonIgnore

data class Note(var id: Long? = null,
                var title: String? = null,
                var text: String? = null,
                @JsonIgnore var user: String? = null)