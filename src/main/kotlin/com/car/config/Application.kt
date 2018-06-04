package com.car.config

import com.car.interfaces.Transport
import com.car.model.Vazic
import com.car.position.TransportPosition
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class Application {

    @Bean
    open fun initTransport():Transport{
        println("Транспорт выезжает")

        TransportPosition.instance

        var vazic = Vazic()
        return  vazic
    }


}

fun main(args: Array<String>) {

    SpringApplication.run(Application::class.java, *args)

}