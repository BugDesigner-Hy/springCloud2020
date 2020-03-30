package com.haiyang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerOrderConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrderConsulApplication.class, args);
    }

}
