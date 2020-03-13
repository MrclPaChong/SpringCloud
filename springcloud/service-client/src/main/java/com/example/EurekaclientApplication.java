package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient //只需加上相关依赖，并进行相应配置，即可将微服务注册到服务发现组件上
/*
*   @EnableDiscoveryClient和@EnableEurekaClient共同点就是：都是能够让注册中心能够发现，扫描到改服务。
    不同点：@EnableEurekaClient只适用于Eureka作为注册中心，@EnableDiscoveryClient 可以是其他注册中心。
* */
@SpringBootApplication
public class EurekaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaclientApplication.class, args);
    }


    @Value("${server.port}")
    String port;

    @RequestMapping("/client")
    public String home(@RequestParam(value = "name", defaultValue = "springcloud") String name) {
        return "----ribbon负载均衡生效----"+"*******方法参数值:"+name+"********端口:"+port;

    }
}
