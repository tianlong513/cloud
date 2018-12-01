package com.tl.cloud.microservicesimpleprovideruser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud
 * @description:
 * @author:
 * @create: 2018-12-01 16:23
 **/
@RestController
public class UserController {

    @GetMapping(value = "cloud1")
    public String cloud1() {
        return "hello cloud1";
    }
}
