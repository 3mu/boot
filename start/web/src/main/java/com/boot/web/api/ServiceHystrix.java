package com.boot.web.api;

import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ZoneAwareLoadBalancer;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.stereotype.Component;

@Component
public  class  ServiceHystrix implements  ServerClient{


    @Override
    public String add() {

        return "this  services is error";
    }
}
