package com.jeffrey.springboot.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean { // boot --> spring applicationContext.xml --> @Configuration 配置 ConfigBean.xxml

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

    /*@Bean
    public userService getUserService(){
        return new UserServiceImpl();
    }*/

// applicationContext.xml == ConfigBean(@Configuration)
// <bean id="userService" class="com.jeffrey.service.Impl.UserServiceImpl"/>
