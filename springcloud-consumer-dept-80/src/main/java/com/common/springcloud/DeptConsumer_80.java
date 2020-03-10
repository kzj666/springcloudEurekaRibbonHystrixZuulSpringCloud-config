package com.common.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//服务降级
//Ribbon 和 Eureka 整合以后,客户端可以直接调用, 不用关心ip地址和端口号
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker   //添加对熔断的支持
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class, args);
    }
}
