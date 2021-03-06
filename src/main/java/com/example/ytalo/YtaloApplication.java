package com.example.ytalo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class YtaloApplication {

    public static void main(String[] args)
    {
        System.setProperty("user.timezone", "UTC-5");
        SpringApplication.run(YtaloApplication.class, args);
    }
}
