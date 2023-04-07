package com.atguigu.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value="cloud-payment-service2")
public interface PaymentFeignService {

    @RequestMapping("hello")
    public String hello();
}
