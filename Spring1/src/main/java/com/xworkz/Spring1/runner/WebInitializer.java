package com.xworkz.Spring1.runner;


import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

    @Override
    protected String[] getServletMappings() {
        String[] urls = {"/"};
        System.out.println("Configured URLs for Dispatcher Servlet");
        return urls;
    }

    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configure){
        System.out.println("Enable static resource handling by server");
        configure.enable();
    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }
}
