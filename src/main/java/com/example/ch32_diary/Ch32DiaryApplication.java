package com.example.ch32_diary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Ch32DiaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch32DiaryApplication.class, args);
    }

}
