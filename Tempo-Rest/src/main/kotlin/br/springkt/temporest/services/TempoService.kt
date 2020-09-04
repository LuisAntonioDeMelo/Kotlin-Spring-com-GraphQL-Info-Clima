package br.springkt.temporest.services

import br.springkt.temporest.domain.TempoEntity
import br.springkt.temporest.model.TempoDto
import br.springkt.temporest.repository.TempoRepository
import br.springkt.temporest.utils.exceptions.DomainNotFoundException
import org.springframework.stereotype.Service

@Service
class  TempoService (val tempoRepository: TempoRepository){

    fun obterTempo(nomeCidade:String,codigoPais:String){
//        val tempoEntity = tempoRepository.obterCidadePorCodigoDoPais(nomeCidade,codigoPais)
//                .orElseThrow{
//                    throw DomainNotFoundException("Um erro inesperado ocorreu")
//                }
//        return
    }

   fun findById(id:Long):TempoDto{
       val tempoEntity =  tempoRepository.findById(id)
               .orElseThrow{
                   throw DomainNotFoundException("")
               }
    return TempoDto.toDto(tempoEntity)
   }

    fun save(tempoEntity: TempoEntity):TempoDto {
        val tempoEntity =  tempoRepository.save(tempoEntity)
        return TempoDto.toDto(tempoEntity)
    }
}