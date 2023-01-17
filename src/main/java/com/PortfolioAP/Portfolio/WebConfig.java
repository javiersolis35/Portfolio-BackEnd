package com.PortfolioAP.Portfolio;

import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.CorsRegistry;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

 

/**

 * Clase que habilita CORS

 * @author YOProgramo

 */

@EnableWebMvc

@Configuration

public class WebConfig implements WebMvcConfigurer {

      @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http:localhost:8080", "https://portfoliofrontend-b6024.web.app")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}


