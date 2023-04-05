package com.Mybatismovies.demo;

import java.time.Year;
import java.util.List;

public interface MovieService {
    List<Movie> findByPublishedYear(String publishedYear);

    Movie findById(int id) throws Exception;

    void create(String name, Year publishedYear);

    void update(int id, String name, Year publishedYear) throws Exception;
}
