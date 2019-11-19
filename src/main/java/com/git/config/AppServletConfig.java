package com.git.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan(value="com.git.api",
        includeFilters={
                @ComponentScan.Filter(type= FilterType.ANNOTATION,classes={Controller.class})},
        useDefaultFilters=false)
@EnableWebMvc//启用spring mvc 默认配置
public class AppServletConfig implements WebMvcConfigurer {
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        //registry.enableContentNegotiation(new MappingJackson2JsonView());
        //registry.jsp("/WEB-INF/", ".jsp");
        registry.viewResolver(html());
        registry.viewResolver(jsp());
    }

   /* @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }*/

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        ;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    //Bean
    public InternalResourceViewResolver html(){
        InternalResourceViewResolver html = new InternalResourceViewResolver();
        html.setOrder(0);
        html.setPrefix("/WEB-INF/");
        html.setSuffix(".html");
        return html;
    }

    //@Bean
    public InternalResourceViewResolver jsp(){
        InternalResourceViewResolver html = new InternalResourceViewResolver();
        html.setOrder(1);
        html.setPrefix("/WEB-INF/");
        html.setSuffix(".jsp");
        return html;
    }

}



