package com.lzq.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhiqi.liu@yoho.cn on 2017/9/27.
 */
@RestController
public class TestController {

    @RequestMapping("/sayHello")
    public Map<String, String> sayHello() {
        Map<String, String> result = new HashMap<>();
        result.put("name", "zhangsan");
        result.put("say", "Hello");
        return result;
    }
}
