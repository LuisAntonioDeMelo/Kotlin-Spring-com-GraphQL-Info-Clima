package br.springkt.temporest.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.beans.Visibility
import java.time.Instant

data class Tempo constructor(val id:Int,
                             val name: String,
                             var temp: Double,
                             var weatherId: Int?,
                             var weatherIcon:String?,
                             var description:String?,
                             var visibility: Double?,
                             var speed:Double?,
                             var deg:Int?,
                             @JsonProperty("dt") val timestamp: Instant) {

    @JsonProperty("main")
    fun unPackMain(main: Map<String, Any>) {
        this.temp = main["temp"] as Double
    }

    @JsonProperty("weather")
    fun unPackClima(weathers: List<Map<String, Any>>) {
        val weather = weathers.first();
        this.weatherId = weather["id"] as Int
        this.weatherIcon = weather["icon"] as String
        this.description = weather["description"] as String

    }

    @JsonProperty("wind")
    fun unPackWind(wind:Map<String,Any>){
        this.speed = wind["speed"] as Double
        this.deg = wind["deg"] as Int
    }
}