package br.springkt.temporest.services

import br.springkt.temporest.config.ApiResource
import br.springkt.temporest.constants.ClimaAppConstantes
import br.springkt.temporest.model.Tempo
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.util.UriComponentsBuilder

@Service
class TempoServiceApi {

    private var restTemplate:RestTemplate

    constructor(restTemplateBuilder: RestTemplateBuilder, apiResouce: ApiResource){
        this.restTemplate = restTemplateBuilder.rootUri(apiResouce.root)
                .build()
    }

    fun obterInformacaoDoClima(cidade:String, codigoPais:String): Tempo? {
        val uriString = UriComponentsBuilder
                .fromPath("/weather?q={city},{countryCode}&appId={appId}")
                .buildAndExpand(cidade,codigoPais, ClimaAppConstantes.Token)
                .toUriString()
        return restTemplate.getForEntity(uriString, Tempo::class.java).body
    }
}