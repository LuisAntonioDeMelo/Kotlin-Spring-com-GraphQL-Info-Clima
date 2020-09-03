package br.springkt.temporest.utils.exceptions

open class KotlinRestApiBusinessException(override val message: String) :
        RuntimeException(message)
