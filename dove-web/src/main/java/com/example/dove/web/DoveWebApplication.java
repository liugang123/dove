package com.example.dove.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务入口函数
 *
 * @author liugang
 * @create 2021/11/22
 */
@SpringBootApplication(scanBasePackages = "com.example")
@EnableDiscoveryClient
public class DoveWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoveWebApplication.class, args);
    }
}
