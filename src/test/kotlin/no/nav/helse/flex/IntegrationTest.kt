package no.nav.helse.flex

import org.amshove.kluent.shouldBeLessOrEqualTo
import org.amshove.kluent.shouldHaveSize
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import java.time.OffsetDateTime

class IntegrationTest : FellesTestOppsett() {
    @Autowired
    private lateinit var logEntryRepository: LogEntryRepository

    @Test
    fun `LogEntry blir lagret`() {
        mockMvc.perform(
            post("/syk/datastream-test/api/v1/log-entry")
                .contentType(MediaType.APPLICATION_JSON),
        ).andExpect(status().isAccepted)

        val logEntries = logEntryRepository.findAll()
        logEntries shouldHaveSize 1
        val logEntry = logEntries.first()
        logEntry.opprettet shouldBeLessOrEqualTo OffsetDateTime.now()
    }
}
