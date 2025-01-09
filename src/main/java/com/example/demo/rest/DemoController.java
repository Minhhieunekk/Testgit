package com.example.demo.rest;

import com.example.demo.common.Coach;
import com.example.demo.common.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
//    private final Coach cricketCoach;
//    private final Coach tennisCoach;
//    private final Coach baseball;
    private Coach myCoach;
    private Coach anotherCoach;
    private CricketCoach cricketCoach;

//    public DemoController(Coach theCoach) {
//        myCoach = theCoach ;
//    }

//    public Coach setMyCoach(Coach theCoach) {
//        myCoach = theCoach;
//        return myCoach;
//    }

// public DemoController(@Qualifier("tennisCoach") Coach theCoach) {
//        myCoach = theCoach;
//    }
@Autowired
//public DemoController(
//        @Qualifier("cricketCoach") Coach cricketCoach,
//
//        @Lazy @Qualifier ("baseball") Coach baseball,
//        @Qualifier("tennisCoach") Coach tennisCoach
//
//) {
//        System.out.println("In Constructor "+ getClass().getSimpleName());
//        this.cricketCoach = cricketCoach;
//        this.tennisCoach = tennisCoach;
//        this.baseball = baseball;
//    }

//public DemoController(
//        @Qualifier("cricketCoach") Coach myCoach,
//        @Qualifier("cricketCoach") Coach anotherCoach
//
//) {
//    this.myCoach = myCoach;
//    this.anotherCoach = anotherCoach;
//    cricketCoach= (CricketCoach) myCoach;
//
//}

public DemoController(
        @Qualifier("swimCoach") Coach myCoach
) {
    this.myCoach = myCoach;

}

    @GetMapping("/coach")
//    public String getCoach() {
//        return "Compare "+ (myCoach == anotherCoach) +" "+ cricketCoach.abc();
//    }
      public String getCoach() {
            return myCoach.getDailyWorkout();
    }
}
