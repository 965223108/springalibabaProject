package org.example.distributeproduct;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class DistributeProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistributeProductApplication.class, args);
    }

}
