package com.increment.callapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CallapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CallapiApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() throws Exception{
        return args -> {
            Runnable r = new Multithread();
            int n = 10;
            for(int i=0;i<n;i++){
                Thread thread = new Thread(r);
                thread.start();
            }
        };
    }
}
