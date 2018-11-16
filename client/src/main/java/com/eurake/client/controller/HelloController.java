package com.eurake.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className:
 * @Description:
 * @auther:ynhj
 * @date:14:07 2018-10-22
 * @version: ver 1.0
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    String port;
    @RequestMapping("hello")
    public String Hello(@RequestParam String name){
        return "hello"+name+",this is" + port;
    }
}
