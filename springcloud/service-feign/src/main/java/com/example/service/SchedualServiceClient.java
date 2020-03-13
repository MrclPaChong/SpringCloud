package com.example.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务。
 * 比如在代码中调用了service-client服务的“/client”接口
 * @author cl
 * @company XX公司
 * @create 2020-02-18 14:18
 */
@FeignClient(value = "eurka-client")
public interface SchedualServiceClient {

    @RequestMapping(value = "/client",method = RequestMethod.GET)
    String sayClientFromClientOne(@RequestParam(value = "name") String name);
}
