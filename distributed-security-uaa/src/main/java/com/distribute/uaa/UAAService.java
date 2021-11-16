package com.distribute.uaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableHystrix
//@EnableFeignClients(basePackages = {"com.distribute.uaa"})
public class UAAService {
    public static void main(String[] args) {
        SpringApplication.run(UAAService.class, args);
    }
}
