package com.startupforge.backend; // Make sure this matches your other files!

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Allow ALL routes
                .allowedOrigins("*") // Allow ALL websites (Netlify, Localhost, etc.)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allow all actions
                .allowedHeaders("*"); // Allow all headers
    }
}