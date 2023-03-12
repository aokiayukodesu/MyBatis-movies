package com.Mybatismovies.demo;

import java.time.Year;
import java.util.List;

public interface MovieService {
    List<Movie> findByReleaseYear();

    Movie findById(int id) throws Exception;
    void create(String name, Year releaseYear);

    void update(int id, String name,Year releaseYear) throws Exception;

}
