package Webconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class config implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Adjust the pattern to your API endpoints
                .allowedOrigins("http://localhost:4200")  // Allow frontend to access the backend
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allow HTTP methods
                .allowedHeaders("*")  // Allow all headers (or specify headers if needed)
                .allowCredentials(true);  // Allow credentials (cookies, authorization headers)
    }
}