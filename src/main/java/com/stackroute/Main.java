package com.stackroute;

import com.stackroute.domain.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Modifier;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie = applicationContext.getBean("movie",Movie.class);
        movie.displayInformation();

        BeanFactory beanFactory = new AnnotationConfigApplicationContext(AppConfig.class);
        movie = beanFactory.getBean("movie", Movie.class);
        movie.displayInformation();
    }
}
