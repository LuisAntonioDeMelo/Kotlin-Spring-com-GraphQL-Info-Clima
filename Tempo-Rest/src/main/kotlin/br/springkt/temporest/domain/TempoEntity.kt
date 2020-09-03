package br.springkt.temporest.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class TempoEntity(
        val cidade:String = "",
        val codigoPais:String = "",
        @Id @GeneratedValue val id:Long? = null
)