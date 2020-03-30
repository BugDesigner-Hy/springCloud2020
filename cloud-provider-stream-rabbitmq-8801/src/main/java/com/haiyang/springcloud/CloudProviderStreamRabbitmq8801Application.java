package com.haiyang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudProviderStreamRabbitmq8801Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderStreamRabbitmq8801Application.class, args);
    }

}
