package com.gwabs.LearnSpringboot;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class course_controller {
    course_logic course_logic = new course_logic();

    @GetMapping("/courses")
    public ArrayList<courses> getAllCourses(){
        return course_logic.addToList();
    }

    @GetMapping("/courses/random")
    public courses getRandomCourse(){
        return course_logic.getSingleCourse();
    }

}
