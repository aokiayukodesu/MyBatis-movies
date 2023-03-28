package com.Mybatismovies.demo;

import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    private MovieMapper movieMapper;

    public MovieServiceImpl(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    @Override
    public List<Movie> findByPublishedYear(String publishedYear) {
        return movieMapper.findByPublishedYear(publishedYear);
    }

    @Override
    public Movie findById(int id) throws Exception {
        return null;
    }

    @Override
    public void create(String name, Year publishedYear) {
    }

    @Override
    public void update(int id, String name, Year publishedYear) throws Exception {
    }
}