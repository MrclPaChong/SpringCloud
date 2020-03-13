springcloud教程：https://blog.csdn.net/forezp/article/details/81040925

springcloud Maven父项目

    1.eureka-server：将项目作为SpringCloud中的注册中心
    
    2.eureka-client：客户端(自己本身对其他是服务)注册到eureka-server
    
    3.负载均衡
    Feign：service-feign-->负载均衡 [基于接口的注解]
        -Ribbon: service-ribbon-->负载均衡 [基于url形式] :ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为。
      Feign默认集成了ribbon
      
    4.断路器
    Netflix
        -Hystrix
        结合负载均衡，代码写在负载均衡里面。
        
    5.路由网关
    Zull 
    测试地址:http://localhost:8769/api-a/hello?name=springcloud&token=22
    
   
    
