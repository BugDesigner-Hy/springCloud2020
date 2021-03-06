package com.haiyang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudConsumerOrder8802StreamRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder8802StreamRabbitmqApplication.class, args);
    }

}
