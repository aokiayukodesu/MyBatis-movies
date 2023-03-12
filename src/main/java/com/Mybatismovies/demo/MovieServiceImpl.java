package com.Mybatismovies.demo;

import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    private MovieMapper movieMapper;
    public MovieServiceImpl(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }


    @Override
    public List<Movie> findByReleaseYear() {
        return null;
    }

    @Override
    public Movie findById(int id) throws Exception {
        return null;
    }

    @Override
    public void create(String name,Year releaseYear) {

    }

    @Override
    public void update(int id, String name, Year releaseYear) throws Exception {

    }

    public List<Movie> movies() {
        return movieMapper.findByReleaseYear();
}}
