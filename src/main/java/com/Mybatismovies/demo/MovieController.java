package com.Mybatismovies.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<Movie> getMovies(@RequestParam(name = "published_year", value = "published_year") String publishedYear) {
        List<Movie> movies = movieService.findByPublishedYear(publishedYear);
        return movies;
    }
}
