package com.haiyang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class CloudConsumerOrder80HystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder80HystrixApplication.class, args);
    }

}
