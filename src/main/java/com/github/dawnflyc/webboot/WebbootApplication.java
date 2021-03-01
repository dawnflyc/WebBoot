package com.github.dawnflyc.webboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class WebbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebbootApplication.class, args);
    }

}
