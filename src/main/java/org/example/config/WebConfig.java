package org.example.config; // 1. 패키지 경로를 반드시 명시해야 합니다.

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // "Cannot resolve symbol" 에러 해결
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // "Cannot resolve method 'addMapping'" 에러 해결
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:3000") // 리액트 포트 허용
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}