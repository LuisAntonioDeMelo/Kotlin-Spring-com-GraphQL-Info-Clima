package br.springkt.temporest.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.sql.Timestamp
import java.time.Instant

data class Tempo constructor(val id:Int,
                                val nome: String,
                                var temp: Double,
                                var climaId: Int?,
                                var climaIcone:String?,
                                 @JsonProperty("dt") val timestamp:Instant){

    @JsonProperty("main")
    fun unPackMain(main:Map<String,Any>){
        this.temp = main["temp"] as Double
    }

    @JsonProperty("clima")
    fun unPackClima(climas:List<Map<String,Any>>){
        val clima =climas.first();
        this.climaId = clima["id"] as Int
        this.climaIcone = clima["icon"] as String
    }
}