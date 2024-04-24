package no.nav.helse.flex

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.time.OffsetDateTime

@RestController
@RequestMapping("/syk/datastream-test/api/v1")
class LogEntryApi(
    private val logEntryRepository: LogEntryRepository,
) {
    @PostMapping("/log-entry")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun postLogEntry() {
        logEntryRepository.save(LogEntryDbRecord(opprettet = OffsetDateTime.now()))
    }
}
