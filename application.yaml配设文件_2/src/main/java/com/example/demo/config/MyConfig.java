package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean("myService1")   //将标注方法的返回值存到spring容器中
    public MyService myService(){

        return new MyService();
    }
}
