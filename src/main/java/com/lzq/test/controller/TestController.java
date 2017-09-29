package com.lzq.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhiqi.liu@yoho.cn on 2017/9/27.
 */
@RestController
public class TestController {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/sayHello")
    public Map<String, String> sayHello(@RequestParam(defaultValue = "zhangsan") String name) {
        log.info("invke the method...");
        Map<String, String> result = new HashMap<>();
        result.put("name", name);
        result.put("say", "Hello");
        result.put("age", "12");
        result.put("address", "beijing");
        result.put("phone", "138XXXXXXXX");

        return result;
    }
}
