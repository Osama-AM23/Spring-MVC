package com.xworkz.dancing.initilizer;

import com.xworkz.dancing.component.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
@ComponentScan("com.xworkz.dancing.component")
@Configuration

public class WebInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {BellyDance.class, BalletDance.class, FolkDance.class, BreakDance.class, TapDance.class
        , SwingDance.class, Bharatanatyam.class, Kathak.class, Karagattam.class, Kathakali.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("Configured For Dispatcher Servlet");
        return new String[] {"/"};
    }
}
