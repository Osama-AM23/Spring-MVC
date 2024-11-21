package com.xworkz.spring5.runner;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class runner5 extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

    public void configreDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
        System.out.println("Configed URLs for dispatcer Servlet");
        configurer.enable();
    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
