package com.yzg.demo.config;

import com.yzg.demo.interceptor.AuthUserInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

@Configuration
public class UserInterceptorConfig implements WebMvcConfigurer {
/*    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthUserInterceptor())
                .addPathPatterns("/**");
    }*/
}

