package br.springkt.temporest.controllers

import br.springkt.temporest.domain.TempoEntity
import br.springkt.temporest.model.Sumario
import br.springkt.temporest.services.TempoService
import br.springkt.temporest.services.TempoServiceApi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/tempo")
class  TempoRestController {

    @Autowired
    private lateinit var tempoServiceApi: TempoServiceApi

    @Autowired
    private lateinit var service:TempoService

    @GetMapping
    fun get(@RequestParam(name="cidade") cidade:String,
    @RequestParam(name="codigoPais") codigoPais:String): Sumario? {
        val tempo = tempoServiceApi.obterInformacaoDoClima(cidade= cidade, codigoPais = codigoPais)
        this.service.save(TempoEntity(cidade,codigoPais));
        return Sumario(codigoPais,cidade,tempo)
    }

    @GetMapping("/celsius")
    fun getCelsius(@RequestParam(name="cidade") cidade:String,
            @RequestParam(name="codigoPais") codigoPais:String): String? {
        val tempo = tempoServiceApi.obterInformacaoDoClima(cidade= cidade, codigoPais = codigoPais)
        return Sumario(codigoPais,cidade,tempo).obterTemperaturaEmCelsius()
    }

    @GetMapping("/pesquisados")
    fun getPesquisados(): MutableIterable<TempoEntity> {
        return this.service.obterTodos()
    }

}