package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("hello")
    public String hello(){
        return "hello world"+serverPort;
    }

    @Autowired
    private PaymentFeignService paymentFeignService;

    @RequestMapping("hello2")
    public String hello2(){
        String hello = paymentFeignService.hello();
        return hello;
    }
}
