package com.example.demo.applicationconfig;

import com.example.demo.filter.TestFilter;
import com.example.demo.listener.TestListener;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ListenerConfig {
    @Bean
    public ServletListenerRegistrationBean<TestListener> serssionListenerBean(){
        ServletListenerRegistrationBean<TestListener>
                sessionListener = new ServletListenerRegistrationBean<TestListener>(new TestListener());
        return sessionListener;
    }
}
