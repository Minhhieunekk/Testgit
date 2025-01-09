package com.example.demo.common;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("In constructor " + getClass().getSimpleName());
    }
    public  String abc() {
        System.out.println("In abc " + getClass().getSimpleName());
        return "Test conflict_3" + getClass().getSimpleName();
    }

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In doMyStartupStuff " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("In doMyCleanupStuff " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice 10000 steps....";
    }
}
