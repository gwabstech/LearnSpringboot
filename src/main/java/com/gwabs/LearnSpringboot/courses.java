package com.gwabs.LearnSpringboot;

public class courses {
    private String name;
    private String author;
    private int id;

    public courses(String name, String author, int id) {
        this.name = name;
        this.author = author;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }
}
