package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xj
 * @date 2021/11/3上午 11:32
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient  //该注解用于向使用consul或zookeeper作为注册中心时  注册服务
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
