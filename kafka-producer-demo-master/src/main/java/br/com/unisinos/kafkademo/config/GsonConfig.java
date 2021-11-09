package br.com.unisinos.kafkademo.config;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class GsonConfig {

    @Bean
    public Gson getGson() {
        return new Gson();
    }

}
