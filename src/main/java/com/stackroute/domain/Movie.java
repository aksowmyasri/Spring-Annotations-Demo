package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

public class Movie
{
    @Autowired
    private List<Actor> actor;

    public Movie(List<Actor> actor) {
        this.actor = actor;
    }

    public List<Actor> getActor() {
        return actor;
    }

    public void setActor(List<Actor> actor) {
        this.actor = actor;
    }

    public void displayInformation()
    {
        for(Actor actor: actor){
            actor.display();
        }
    }
    public void initMethod(){
        actor= Arrays.asList(new Actor("ABC","Female",21),new Actor("Pallavi","Female",17),new Actor("Xyz","male",22));
    }
}
