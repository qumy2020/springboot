package com.qumy.springbootinterceptor.config;

import com.qumy.springbootinterceptor.interceptor.AuthenticationInterceptor;
import com.qumy.springbootinterceptor.interceptor.ResourceInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
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
     * 添加Spring MVC生命周期拦截器，用于控制器方法调用和资源处理程序请求的预处理和后处理。
     * 可以注册拦截器以应用于所有请求，也可以限制为URL模式的子集。
     *
     * @param registry 帮助配置映射拦截器列表
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticationInterceptor())
                .addPathPatterns("/**")// 拦截路径
                .excludePathPatterns("/test/exclude/**")// 放行路径
                .order(2);// 执行顺序

        registry.addInterceptor(resourceInterceptor())
                .addPathPatterns("/**")// 拦截路径
                .excludePathPatterns("/test/exclude/**")// 放行路径
                .order(1);// 执行顺序
    }

    @Bean
    public AuthenticationInterceptor authenticationInterceptor() {
        return new AuthenticationInterceptor();
    }

    @Bean
    public ResourceInterceptor resourceInterceptor() {
        return new ResourceInterceptor();
    }
}
