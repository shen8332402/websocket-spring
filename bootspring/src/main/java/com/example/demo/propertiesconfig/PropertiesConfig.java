package com.example.demo.propertiesconfig;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "oneself")
public class PropertiesConfig {
    private String isUse;
    private String isDel;

    public String getIsUse() {
        return isUse;
    }

    public void setIsUse(String isUse) {
        this.isUse = isUse;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "PropertiesConfig{" +
                "isUse='" + isUse + '\'' +
                ", isDel='" + isDel + '\'' +
                '}';
    }
}
