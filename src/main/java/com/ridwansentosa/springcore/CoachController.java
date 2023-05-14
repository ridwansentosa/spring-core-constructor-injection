package com.ridwansentosa.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CoachController {

    private Coach myCoach;

    @Autowired
    public CoachController(Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyworkout")
    public List<String> getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
