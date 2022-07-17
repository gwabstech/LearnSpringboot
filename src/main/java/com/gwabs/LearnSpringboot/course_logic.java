package com.gwabs.LearnSpringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

public class course_logic {


    private ArrayList<courses> courses = new ArrayList<>();



    public ArrayList<courses> addToList(){
        courses courses1 = new courses("Intro to HTML, CSS and JAVA","Abubakar Abdullahi Gwabare",7);
        for (int i = 0 ; i< 10 ; i++){

            courses.add(courses1);
        }
        return courses;
    }

    public courses getSingleCourse(){
        addToList();
        int min = 0;
        Random r = new Random();
        int index = r.nextInt(min,courses.size()-1);
        return courses.get(index);
    }
}
