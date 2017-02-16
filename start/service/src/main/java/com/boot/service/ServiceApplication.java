/**
 * Created by Administrator on 2017/2/16 0016.
 */
package com.boot.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class ServiceApplication {

    public  static  void  main(String[] args){

        SpringApplication.run(ServiceApplication.class,args);

    }
    @RequestMapping
    public String getHello(){
        return  "hello this is my code";
    }
}
