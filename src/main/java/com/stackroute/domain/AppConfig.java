package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class AppConfig
{
    @Bean(value="firstMovie", initMethod = "initMethod")
    public Movie movie()
    {
        return new Movie();
    }
    @Bean(value = {"secondMovie"}, initMethod = "initMethod")
    public Movie getMovie() {
        return new Movie(new Actor());
    }

    @Bean(value = {"beanLifeCycle"}, initMethod = "customInit", destroyMethod = "customDestroy")
    public BeanLifeCycleDemoBean beanLifeCycleDemo() {
        return new BeanLifeCycleDemoBean();
    }


    @Bean
    public Actor actor()
    {
        return  new Actor();
    }
}
