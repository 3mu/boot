package com.boot.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/2/19 0019.
 */
@RestController
public class RestApiController {
    @RequestMapping("/api")
    public String webHello() {
      return  "123";
    }
}
