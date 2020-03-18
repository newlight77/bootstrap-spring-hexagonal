package io.github.newlight77.bootstrap.api

import io.github.newlight77.bootstrap.model.Note
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.oidc.user.OidcUser
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

@RestController
@RequestMapping("api")
class UserApi() {

    @GetMapping("/user/notes")
    fun notes(principal: Principal): List<Note> {
        println("Fetching notes for user: ${principal.name}")
            return listOf()
    }

    @GetMapping("/user")
    fun user(@AuthenticationPrincipal user: OidcUser): OidcUser {
        return user;
    }
}