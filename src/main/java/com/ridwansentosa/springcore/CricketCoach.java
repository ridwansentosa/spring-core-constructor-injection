package com.ridwansentosa.springcore;

import org.springframework.stereotype.Component;

import java.sql.ClientInfoStatus;
import java.util.List;

@Component
public class CricketCoach implements Coach{
    @Override
    public List<String> getDailyWorkout() {
        List<String> result = List.of("Squat", "Single Leg Squat", "Romanian Deadlift", "Cook Hip Lift", "Medicine Ball Throws");
        return result;
    }
}
