package com.Localise.demo;

import javax.persistence.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;

import javax.persistence.GeneratedValue;

@ComponentScan
@EnableAutoConfiguration
public class LocaliseApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocaliseApplication.class, args);
    }
}


