package com.gwabs.LearnSpringboot;

import java.util.ArrayList;

public class course_logic {


    private ArrayList<courses> courses = new ArrayList<>();
    courses courses1 = new courses("Intro to HTML","Abubakar",2);

    public ArrayList<courses> addToList(){
        for (int i = 0 ; i< 10 ; i++){

            courses.add(courses1);
        }
        return courses;
    }
}
