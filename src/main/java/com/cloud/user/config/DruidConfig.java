package com.cloud.user.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DruidConfig {

    @Bean
    public ServletRegistrationBean startViewServlet(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        registrationBean.addInitParameter("allow", "192.168.150.3");
        registrationBean.addInitParameter("deny", "192.168.150.156");
        registrationBean.addInitParameter("loginUsername", "admin");
        registrationBean.addInitParameter("loginPassword", "admin");
        registrationBean.addInitParameter("resetEnable", "false");
        return registrationBean;
    }


    @Bean
    public FilterRegistrationBean startFilter(){
        FilterRegistrationBean filterBean = new FilterRegistrationBean(new WebStatFilter());
        filterBean.addUrlPatterns("/*");
        filterBean.addInitParameter("exclustions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*,");
        return filterBean;
    }
}
