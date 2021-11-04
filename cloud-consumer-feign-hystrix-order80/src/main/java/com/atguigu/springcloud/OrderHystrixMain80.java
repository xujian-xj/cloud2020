package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xj
 * @date 2021/11/4上午 11:21
 * @description:
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
//@EnableEurekaClient
public class OrderHystrixMain80 {
    public static void main(String[] args){
        SpringApplication.run(OrderHystrixMain80.class,args);
    }
}
