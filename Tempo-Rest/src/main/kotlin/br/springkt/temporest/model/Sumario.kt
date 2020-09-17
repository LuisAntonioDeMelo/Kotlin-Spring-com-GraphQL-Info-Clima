package br.springkt.temporest.model

data class Sumario(
    val pais:String,
    val cidade:String,
    val codigoCidade:Int?,
    val icon:String?,
    val temperatura:Double?
){

    var temperaturaCelcius: Double? = temperatura
        get():Double? {
            return (toCelcius(this.temperatura))
        }

    constructor(pais:String,cidade: String,tempo: Tempo?)
    :this(
            pais,
            cidade,
            tempo?.id,
            tempo?.weatherIcon,
            tempo?.temp
    )



    fun obterTemperaturaFahrenheit():String {
        val fahrenheit = (this.temperatura !! *1.8) -459.67
        return String.format("%.2f",fahrenheit)
    }

    fun obterTemperaturaEmCelsius() : String {
        return String.format("%.2f",toCelcius(this.temperatura))
    }

    private fun toCelcius(value:Double?):Double {
        return value !! -273.15
    }


}