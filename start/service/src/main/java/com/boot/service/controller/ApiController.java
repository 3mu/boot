package com.boot.service.controller;

import com.boot.service.domain.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/3/19 0019.
 */
@RestController
public class ApiController {

    @Autowired
    public IService iService;

    @RequestMapping(value = "/msg")
    public String getMessage() {
        return iService.getMessage();
    }
}
