package br.springkt.temporest.model

import br.springkt.temporest.domain.TempoEntity

data class TempoDto(var cidade:String, var codigoPais:String, var id:Long){

    companion object {
        fun toDto(tempoEntity: TempoEntity): TempoDto =
                TempoDto(tempoEntity.cidade, tempoEntity.codigoPais,tempoEntity.id!!)
    }
}