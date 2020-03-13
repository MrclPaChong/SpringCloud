package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author cl
 * @company XX公司
 * @create 2020-02-18 11:29
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    /**
     * 通过之前注入ioc容器的restTemplate来消费service-hi服务的“/hi”接口，在这里我们直接用的程序名替代了具体的url地址，
     * 在ribbon中它会根据服务名来选择具体的服务实例，根据服务实例在请求的时候会用具体的url替换掉服务名
     * @param name
     * @return
     */
    public String serviceClientService(String name) {
        return restTemplate.getForObject("http://eurka-client/client?name="+name,String.class);
    }

}
