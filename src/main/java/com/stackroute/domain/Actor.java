package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actor {
    @Value("${actor.name}")
    private String name;
    @Value("${actor.gender}")
    private String gender;
    @Value("${actor.age}")
    private int age;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display()
    {
        System.out.println("Name:"+name+"Gender :"+gender+"Age : "+age);
    }
}
