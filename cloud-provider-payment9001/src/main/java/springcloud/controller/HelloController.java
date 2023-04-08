package springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("hello")
    public String hello(){
        log.info("我被调用了");
        return "hello world"+serverPort;
    }
    @Autowired
    private RocketMQTemplate template;

    @RequestMapping("rocketmq")
    public String rocketmq(){
        log.info("我被调用了-rocketmq");
        template.convertAndSend("mytopic-ly","hello1231");
        return "hello world"+serverPort;
    }
}
