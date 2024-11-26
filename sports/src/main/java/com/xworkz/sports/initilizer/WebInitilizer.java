package com.xworkz.sports.initilizer;

import com.xworkz.sports.component.Stadium;
import com.xworkz.sports.component.Team;
import com.xworkz.sports.configuration.SportsConfiguration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SportsConfiguration.class,Stadium.class, Team.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("Configured For Dispatcher Servlet");
        return new String[] {"/"};
    }
}
