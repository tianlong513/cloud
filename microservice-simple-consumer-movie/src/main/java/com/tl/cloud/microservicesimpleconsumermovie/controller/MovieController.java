package com.tl.cloud.microservicesimpleconsumermovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud
 * @description:
 * @author:
 * @create: 2018-12-01 16:26
 **/
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("cloud2")
    public String cloud2() {
        return this.restTemplate.getForObject("http://127.0.0.1:8080/tl/cloud1", String.class);
    }
}
