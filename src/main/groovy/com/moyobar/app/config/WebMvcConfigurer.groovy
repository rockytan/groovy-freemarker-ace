package com.moyobar.app.config

import com.moyobar.app.interceptor.MenuHandlerInterceptor
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

/**
 * Created by Rocky on 9/14/16.
 */
@Configuration
class WebMvcConfigurer extends WebMvcConfigurerAdapter{

    @Override
    void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MenuHandlerInterceptor())
    }
}
