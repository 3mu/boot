package com.boot.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/2/19 0019.
 */
@RestController
public class RestApiController {
    @RequestMapping("/api")
    public String webHello() {
      return  "123";
    }

    @Autowired
    RestTemplate restTemplate;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return restTemplate.getForEntity("http://Server/get", String.class).getBody();
    }
}
