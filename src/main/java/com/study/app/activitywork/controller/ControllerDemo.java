package com.study.app.activitywork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenqi.chen, <wenqi.chen@leyantech.com>
 * @Description:
 * @date 2020-03-18
 */
@RestController
public class ControllerDemo {

    @GetMapping(value = "/hello")
    public String hello(@RequestParam(value = "name",defaultValue = "world")String name){

        return String.format("hello %s",name);

    }
}
