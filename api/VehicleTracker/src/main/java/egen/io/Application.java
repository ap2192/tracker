package egen.io;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan
@EnableWebMvc
public class Application extends WebMvcConfigurerAdapter{
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("*//*").allowedMethods("POST","PUT")
                .allowedOrigins("http://mocker.egen.io/").allowedHeaders("accepts","Origin",
                "Access-Control-Request-Method","Access-Control-Request-Method")
                .allowCredentials(false).maxAge(3600);
    }

}