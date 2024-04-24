package no.nav.helse.flex

import org.junit.jupiter.api.Test
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

class IntegrationTest : FellesTestOppsett() {
    @Test
    fun `LogEntry blir lagret`() {
        mockMvc.perform(
            post("/syk/datastream-test/api/v1/log-entry")
                .contentType(MediaType.APPLICATION_JSON),
        ).andExpect(status().isAccepted)
    }
}
