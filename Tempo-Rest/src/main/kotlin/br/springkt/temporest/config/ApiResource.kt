package br.springkt.temporest.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

//configurar para receber dados da api externa

@Configuration
@ConfigurationProperties(prefix = "api")
data class ApiResource(var root:String? = null)