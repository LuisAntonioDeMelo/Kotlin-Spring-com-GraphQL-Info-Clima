## Descrição 
    Dev...
Utilizando spring com Kotlin e GraphQL 


## Vantagens

- Evita problemas de nullPointers
- Menos codigo boleirplate comparado ao Java
- Não é necessário lib's como Lombok
- Bibliotecas em Java são compatíveis  


## Api
  power by:  https://api.openweathermap.org/data/2.5

### json

    @Get
    http://localhost:8080/tempo?cidade=goiania&codigoPais=br

    tempoRaw = {
      "id": 3462377,
      "name": "Goiânia",
      "temp": 296.15,
      "weatherId": 801,
      "weatherIcon": "02n",
      "description": "few clouds",
      "visibility": 10000.0,
      "speed": 2.6,
      "deg": 60,
      "dt": "2020-09-04T05:24:03Z"
    }
    
     @Get
    http://localhost:8080/tempo?cidade=paris&codigoPais=fr

    sumario = {
      "pais": "fr",
      "cidade": "paris",
      "codigoCidade": 2988507,
      "icon": "03n",
      "temperatura": 294.81,
      "temperaturaCelcius": 21.660000000000025
     }

## Referências  

https://dev.to/grekz/graphql-kotlin-spring-boot-part-1-2cc7
