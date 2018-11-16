package com.cloud.ribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @className:
 * @Description:
 * @auther:ynhj
 * @date:16:27 2018-11-16
 * @version: ver 1.0
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate template;
    @RequestMapping("/robbion")
    public String helloConsumer(){
        return template.getForEntity("http://CLIENT/hello?name=123",String.class).getBody();
    }
}
