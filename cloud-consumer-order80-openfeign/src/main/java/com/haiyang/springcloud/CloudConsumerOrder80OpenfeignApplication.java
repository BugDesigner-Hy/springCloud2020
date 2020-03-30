package com.haiyang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class CloudConsumerOrder80OpenfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder80OpenfeignApplication.class, args);
    }

}
