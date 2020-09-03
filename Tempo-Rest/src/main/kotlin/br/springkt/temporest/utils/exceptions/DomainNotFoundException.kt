package br.springkt.temporest.utils.exceptions

class DomainNotFoundException(override val message:String):
        KotlinRestApiBusinessException(message)