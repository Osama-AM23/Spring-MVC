package com.xworkz.spring6.runner;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class runner6 extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
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
        String[] urls= {"/"};
        System.out.println("Configed Urls in Dispatcher Servlet");
        return urls;
    }

    public  void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
        System.out.println("Enable static resource handling by server");
        configurer.enable();
    }
}
