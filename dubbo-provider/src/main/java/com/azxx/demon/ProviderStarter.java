package com.azxx.demon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ProviderStarter {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ProviderStarter.class,args);
    }
}
