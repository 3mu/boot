package com.boot.web.api;

import org.springframework.stereotype.Component;

@Component
public  class  ServiceHystrix implements  ServerClient{


    @Override
    public String add() {
        return "this  services is error";
    }
}
