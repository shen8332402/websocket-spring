package com.example.demo.controller;

import com.example.demo.propertiesconfig.JdbcProperties;
import com.example.demo.propertiesconfig.PropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestPropertiesConfig {
    @Autowired
    private PropertiesConfig propertiesConfig;
    @Autowired
    private JdbcProperties jdbcProperties;
    @RequestMapping("/getConfig")
    public String index(){
        return propertiesConfig.toString();
    }

    @RequestMapping("/getConfigJdbc")
    public String index2(){
        return jdbcProperties.toString();
    }
}
