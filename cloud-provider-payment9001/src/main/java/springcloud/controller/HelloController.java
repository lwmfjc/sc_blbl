package springcloud.controller;

import lombok.extern.slf4j.Slf4j;
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
}
