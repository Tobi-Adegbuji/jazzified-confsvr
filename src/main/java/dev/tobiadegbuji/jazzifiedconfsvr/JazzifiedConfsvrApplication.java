package dev.tobiadegbuji.jazzifiedconfsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class JazzifiedConfsvrApplication {

    public static void main(String[] args) {
        SpringApplication.run(JazzifiedConfsvrApplication.class, args);
    }

}
