package com.stackroute;

import com.stackroute.domain.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Modifier;

public class Main
{
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie firstMovie = applicationContext.getBean("Movie A, Movie B", Movie.class);
        firstMovie.displayInformation();

        Movie secondMovie = applicationContext.getBean("Movie A, Movie B", Movie.class);
        secondMovie.displayInformation();

        if (firstMovie == secondMovie) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
