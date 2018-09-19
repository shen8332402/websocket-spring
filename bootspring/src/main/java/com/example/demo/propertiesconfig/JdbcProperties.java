package com.example.demo.propertiesconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(name = "jdbc配置文件",value = "jdbc.properties" )
public class JdbcProperties {
    @Value("${jdbc.alias}")
    private String alias;
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.maximumActiveTime}")
    private String maximumActiveTime;
    @Value("${jdbc.minimumConnectionCount}")
    private String minimumConnectionCount;
    @Value("${jdbc.simultaneousBuildThrottle}")
    private String simultaneousBuildThrottle;
    @Value("${jdbc.houseKeepingTestSql}")
    private String houseKeepingTestSql;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMaximumActiveTime() {
        return maximumActiveTime;
    }

    public void setMaximumActiveTime(String maximumActiveTime) {
        this.maximumActiveTime = maximumActiveTime;
    }

    public String getMinimumConnectionCount() {
        return minimumConnectionCount;
    }

    public void setMinimumConnectionCount(String minimumConnectionCount) {
        this.minimumConnectionCount = minimumConnectionCount;
    }

    public String getSimultaneousBuildThrottle() {
        return simultaneousBuildThrottle;
    }

    public void setSimultaneousBuildThrottle(String simultaneousBuildThrottle) {
        this.simultaneousBuildThrottle = simultaneousBuildThrottle;
    }

    public String getHouseKeepingTestSql() {
        return houseKeepingTestSql;
    }

    public void setHouseKeepingTestSql(String houseKeepingTestSql) {
        this.houseKeepingTestSql = houseKeepingTestSql;
    }

    @Override
    public String toString() {
        return "JdbcProperties{" +
                "alias='" + alias + '\'' +
                ", driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", maximumActiveTime='" + maximumActiveTime + '\'' +
                ", minimumConnectionCount='" + minimumConnectionCount + '\'' +
                ", simultaneousBuildThrottle='" + simultaneousBuildThrottle + '\'' +
                ", houseKeepingTestSql='" + houseKeepingTestSql + '\'' +
                '}';
    }
}
