package com.example.controller;

import com.example.service.SchedualServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cl
 * @company XX公司
 * @create 2020-02-18 14:22
 */
@RestController
public class HelloController {

    @Autowired
    SchedualServiceClient schedualServiceClient;


    /**
     * 基于接口的负载均衡
     * @param name
     * @return
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloFeign(@RequestParam String name){

        return schedualServiceClient.sayClientFromClientOne(name);
    }
}
