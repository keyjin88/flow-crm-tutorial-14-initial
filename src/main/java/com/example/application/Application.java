package com.example.application;

import com.vaadin.flow.component.dependency.NpmPackage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * The entry point of the Spring Boot application.
 */
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
@NpmPackage(value = "lumo-css-framework", version = "^4.0.10")
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
