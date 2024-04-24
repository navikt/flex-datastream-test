package no.nav.helse.flex

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/syk/datastream-test/api/v1")
class LogEntryApi {
    private final val log = logger()

    @PostMapping("/log-entry")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun postLogEntry() {
        log.info("Mottok POST-kall til /log-entry.")
    }
}
