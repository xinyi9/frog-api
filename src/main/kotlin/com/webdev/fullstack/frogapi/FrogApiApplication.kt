package com.webdev.fullstack.frogapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

//Enable component-scanning and auto-configuration
/**
 * @Configuration Designates a class as a configuration class using Spring’s Java-based configuration.
 * We’ll favor Java-based configuration over XML configura- tion when we do.
 * @ComponentScan Enables component-scanning so that the web con- troller classes and other components you write will be
 * automatically discovered and registered as beans in the Spring application context.
 * @EnableAutoConfiguration it’s the one line of configuration that enables the magic of Spring Boot auto-configuration.
 */
@SpringBootApplication
class FrogApiApplication

fun main(args: Array<String>) {
	runApplication<FrogApiApplication>(*args)
}

