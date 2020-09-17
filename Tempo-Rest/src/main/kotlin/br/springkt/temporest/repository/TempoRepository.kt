package br.springkt.temporest.repository

import br.springkt.temporest.domain.TempoEntity
import org.springframework.data.repository.CrudRepository
import java.util.*

interface TempoRepository : CrudRepository<TempoEntity,Long> {

}