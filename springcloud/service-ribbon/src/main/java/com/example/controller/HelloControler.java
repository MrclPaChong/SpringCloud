package com.example.controller;

import com.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cl
 * @company XX公司
 * @create 2020-02-18 11:34
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    /**
     * 测试 ribbon 负载均衡是否成功：可以访问到service-client服务
     * @param name
     * @return
     */
    @GetMapping(value = "/hello")
    public String helloRibbon(@RequestParam String name) {
        return helloService.serviceClientService( name );
    }
}