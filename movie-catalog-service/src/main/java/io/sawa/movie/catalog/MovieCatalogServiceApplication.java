package io.sawa.movie.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class MovieCatalogServiceApplication {

    public static void main(String[] args) {
	SpringApplication.run(MovieCatalogServiceApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplateClient() {
	return new RestTemplate();
    }

}
