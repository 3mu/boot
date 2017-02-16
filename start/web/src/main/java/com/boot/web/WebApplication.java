/**
 * Created by Administrator on 2017/2/16 0016.
 */
package com.boot.web;

import com.boot.service.ServiceApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class WebApplication {

    public  static  void main(String[] args){

        SpringApplication.run(WebApplication.class,args);
    }
   public String webHello(){

       String message=  new ServiceApplication().getHello();
       return  String.format("from web {0}",message);
   }
}
