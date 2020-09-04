package br.springkt.temporest.repository

import br.springkt.temporest.domain.TempoEntity
import org.springframework.data.repository.CrudRepository

interface TempoRepository : CrudRepository<TempoEntity,Long> {
    //fun obterCidadePorCodigoDoPais(cidade:String,codigo:String): Optional<TempoEntity>

}