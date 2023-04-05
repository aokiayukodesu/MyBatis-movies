package com.Mybatismovies.demo;

import java.time.Year;

public class Movie {

    private int id;
    private String name;

    private Year publishedYear;

    public Movie(int id, String name, Year publishedYear) {
        this.id = id;
        this.name = name;
        this.publishedYear = publishedYear;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Year getPublishedYear() {
        return publishedYear;
    }
}
