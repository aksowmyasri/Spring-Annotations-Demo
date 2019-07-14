package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Arrays;
import java.util.List;

public class Movie
{
    @Autowired
    private Actor actor;

    public Movie() {

    }

    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
        System.out.println("Constructor Called");
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
        System.out.println("Setter Method Called");
    }

    public void displayInformation() {
        actor.display();
    }

    public void initMethod() {
        actor = new Actor("ABC", "Female", 12);
    }

}
