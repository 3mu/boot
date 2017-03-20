/**
 * Created by Administrator on 2017/3/19 0019.
 */
package com.boot.web.cloud;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CloudApplication.class).web(true).run(args);
    }

}