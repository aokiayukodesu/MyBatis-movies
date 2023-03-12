package com.Mybatismovies.demo;

import java.time.Year;

public class Movie {
    private String name;

    private int id;

    private Year releaseYear;


    public Movie(String name, int id, Year releaseYear) {
        this.name = name;
        this.id = id;
        this.releaseYear = releaseYear;
    }

    public Year getReleaseYear() {
        return releaseYear;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

