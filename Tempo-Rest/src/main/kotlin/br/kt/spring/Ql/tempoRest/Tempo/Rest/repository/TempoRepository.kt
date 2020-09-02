package br.kt.spring.Ql.tempoRest.Tempo.Rest.repository

import br.kt.spring.Ql.tempoRest.Tempo.Rest.domain.TempoEntity
import br.kt.spring.Ql.tempoRest.Tempo.Rest.model.Tempo
import org.springframework.data.repository.CrudRepository
import java.util.*

interface TempoRepository : CrudRepository<Tempo,Long> {
    fun obterCidadePorCodigoDoPais(cidade:String,codigo:String): Optional<TempoEntity>

}