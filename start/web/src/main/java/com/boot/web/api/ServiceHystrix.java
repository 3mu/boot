package com.boot.web.api;

import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ZoneAwareLoadBalancer;
import org.springframework.stereotype.Component;

@Component
public  class  ServiceHystrix implements  ServerClient{


    @Override
    public String add() {

////        com.netflix.loadbalancer.
//        ZoneAwareLoadBalancer<Server> lb = (ZoneAwareLoadBalancer<Server>) springClientFactory.getLoadBalancer("CLOUD-SERVICE");
//        Server server = lb.chooseServer();
//        System.out.println("error->" + server.getHostPort());
//        lb.markServerDown(server);

        return "this  services is error";
    }
}
