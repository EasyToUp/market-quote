package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.example"})
public class ServerApplication {
    public static void main(String[] args) {
        //程序入口
        SpringApplication.run(ServerApplication.class, args);
    }
}