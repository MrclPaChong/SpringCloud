package com.example.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author cl
 * @company XX公司
 * @create 2020-02-18 15:17
 */
@Service
public class HystrixService {

    @Autowired
    RestTemplate restTemplate;


    /**
     * 加上@HystrixCommand注解。该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法，
     * 熔断方法直接返回了一个字符串，字符串为"hi,"+name+",sorry,error!"
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "clientError")
    public String serviceClientService(String name) {
        return restTemplate.getForObject("http://eurka-client/client?name="+name,String.class);
    }

    public String clientError(String name) {
        return "client,"+name+",sorry,error!";
    }


}
