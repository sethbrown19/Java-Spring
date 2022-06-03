package com.luv2code.springdemo;

import com.example.springdemoone.SpringDemoOneApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApp {

    public static void main(String[] args) {
        // create the object
        Coach baseballCoach = new BaseballCoach();
        Coach trackCoach = new TrackCoach();

        // use the object
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyWorkout());


        //SpringApplication.run(SpringDemoOneApplication.class, args);
    }

}
