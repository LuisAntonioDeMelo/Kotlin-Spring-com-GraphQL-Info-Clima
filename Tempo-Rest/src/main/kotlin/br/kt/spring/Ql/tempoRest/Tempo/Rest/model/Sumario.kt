package br.kt.spring.Ql.tempoRest.Tempo.Rest.model

data class RelatorioTempo(
    val pais:String,
    val cidade:String,
    val codigoCidade:Int?,
    val icon:String?,
    val temperatura:Double?
){
    constructor(pais:String,cidade: String,tempo:Tempo?)
    :this(pais,cidade,tempo?.id,tempo?.climaIcone,tempo?.temp)

    fun obterTemperaturaFahrenheit():String {
        val fahrenheit = (this.temperatura !! *1.8) -459;67
        return String.format("%4,2f",fahrenheit)
    }

    fun obterTemperaturaEmCelsius() : String {
        val celcius = this.temperatura !! -273.15
        return String.format("4.2f",celcius)
    }


}