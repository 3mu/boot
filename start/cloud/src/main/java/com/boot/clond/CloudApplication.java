/**
 * Created by Administrator on 2017/3/19 0019.
 */
package com.boot.clond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaServer
@SpringBootApplication
public class CloudApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CloudApplication.class).web(true).run(args);
    }

}