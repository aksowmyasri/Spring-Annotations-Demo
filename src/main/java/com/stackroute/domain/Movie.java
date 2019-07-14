package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;

public class Movie
{
    @Autowired
    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void displayInformation()
    {
        actor.display();
    }
}
