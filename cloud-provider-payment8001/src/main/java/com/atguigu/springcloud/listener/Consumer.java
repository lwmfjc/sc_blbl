package com.atguigu.springcloud.listener;


import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@RocketMQMessageListener(topic = "mytopic-ly",
        consumeMode = ConsumeMode.CONCURRENTLY,consumerGroup = "${rocketmq.producer.group}")
@Slf4j
@Component
public class Consumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String s) {
        log.info("消费了"+s);
    }
}
