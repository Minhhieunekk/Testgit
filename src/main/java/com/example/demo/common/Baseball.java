package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component

public class Baseball implements Coach{
    public Baseball() {
        System.out.println("Hello " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "play baseball";
    }
}
