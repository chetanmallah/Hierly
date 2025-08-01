 package com.chetan.hierly;


 import org.springframework.beans.factory.annotation.Value;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 import org.springframework.web.servlet.config.annotation.CorsRegistry;
 import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

 @Configuration
 public class WebConfig implements WebMvcConfigurer {

     @Value("${frontend.url}")
     private String frontendUrl;


     @Override
     public void addCorsMappings(CorsRegistry registry) {
         // Configure CORS for the entire application
         registry.addMapping("/**")                           // Apply to all endpoints
                  .allowedOrigins(frontendUrl)    // Allow requests from your React app
//                 .allowedOrigins("https://heartfelt-dasik-0f3179.netlify.app/")
                 .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allow the specified methods
                 .allowedHeaders("*")                       // Allow all headers
                 .allowCredentials(true);                   // Allow credentials (like cookies or session)
     }
 }
