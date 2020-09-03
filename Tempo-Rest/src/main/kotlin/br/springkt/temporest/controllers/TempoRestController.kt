package br.springkt.temporest.controllers

import br.springkt.temporest.model.Tempo
import br.springkt.temporest.services.TempoServiceApi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tempo")
class  TempoRestController {

    @Autowired
    private lateinit var tempoServiceApi: TempoServiceApi

    @GetMapping
    fun get(@RequestParam(name="cidade") cidade:String,
    @RequestParam(name="codigoPais") codigoPais:String): Tempo? {
        return tempoServiceApi.obterInformacaoDoClima(cidade= cidade, codigoPais = codigoPais)
    }
}