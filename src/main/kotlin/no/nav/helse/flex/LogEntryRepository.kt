package no.nav.helse.flex

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.time.OffsetDateTime

@Repository
interface LogEntryRepository : CrudRepository<LogEntryDbRecord, String>

@Table("log_entry")
data class LogEntryDbRecord(
    @Id
    val id: String? = null,
    val opprettet: OffsetDateTime,
)
