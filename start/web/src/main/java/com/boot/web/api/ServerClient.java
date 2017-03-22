package com.boot.web.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("Server")
@Service
public interface ServerClient {
    @RequestMapping(method = RequestMethod.GET, value = "/get")
    String add();
}
