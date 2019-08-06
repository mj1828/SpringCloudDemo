package com.zmc.commonconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CommonConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonConfigApplication.class, args);
    }

}
