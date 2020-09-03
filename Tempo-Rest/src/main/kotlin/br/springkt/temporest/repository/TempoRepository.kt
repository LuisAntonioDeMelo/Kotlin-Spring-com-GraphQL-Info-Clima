package br.springkt.temporest.repository

import br.springkt.temporest.domain.TempoEntity
import br.springkt.temporest.model.Tempo
import org.springframework.data.repository.CrudRepository
import java.util.*

interface TempoRepository : CrudRepository<TempoEntity,Long> {
    fun obterCidadePorCodigoDoPais(cidade:String,codigo:String): Optional<TempoEntity>

}