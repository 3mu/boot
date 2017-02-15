package com.boot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class BootApplication {
    /**
     * 主函数
     *
     */

    public static void main(String[] args) {
        System.out.println("-------------");
        SpringApplication.run(BootApplication.class, args);
        
    }
}
