package com.boot.app;import org.springframework.boot.SpringApplication;import org.springframework.boot.autoconfigure.EnableAutoConfiguration;import org.springframework.boot.autoconfigure.SpringBootApplication;import org.springframework.stereotype.Controller;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.ResponseBody;import com.boot.rest.invoker;@SpringBootApplication@EnableAutoConfigurationpublic class boot {    /**     * 主函数     *     */    public static void main(String[] args) {        System.out.println("-------------");        SpringApplication.run(invoker.class, args);    }}