package br.springkt.temporest.controllers

import br.springkt.temporest.domain.TempoEntity
import br.springkt.temporest.model.Sumario
import br.springkt.temporest.model.Tempo
import br.springkt.temporest.repository.TempoRepository
import br.springkt.temporest.services.TempoService
import br.springkt.temporest.services.TempoServiceApi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("climaTempo")
class SumarioController(val tempoServiceApi: TempoServiceApi, val tempoRepository: TempoRepository) {




    private fun criarSumario(tempoEntity: TempoEntity): Sumario {
        val tempo = tempoServiceApi.obterInformacaoDoClima(tempoEntity.cidade, tempoEntity.codigoPais)
        return Sumario(tempoEntity.codigoPais,tempoEntity.cidade,tempo)
    }
}
