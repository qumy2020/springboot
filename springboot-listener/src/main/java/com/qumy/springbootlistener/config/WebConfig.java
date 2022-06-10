package com.qumy.springbootlistener.config;

import com.qumy.springbootlistener.listener.MyListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Web配置类
 *
 * @author qumy
 * @since 2022/6/10 10:13
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * 注册 MyListener 监听器
     *
     * @return ServletListenerRegistrationBean
     */
    @Bean
    public ServletListenerRegistrationBean<MyListener> registrationListener1() {
        ServletListenerRegistrationBean<MyListener> registrationBean = new ServletListenerRegistrationBean<>();
        registrationBean.setListener(new MyListener());
        return registrationBean;
    }

}
