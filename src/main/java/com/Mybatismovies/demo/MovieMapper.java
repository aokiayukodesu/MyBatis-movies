package com.Mybatismovies.demo;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.Year;
import java.util.List;
import java.util.Optional;

@Mapper
public interface MovieMapper {
   @Select("SELECT * FROM movies where releaseYear = 2000")
   List<Movie> findByReleaseYear();
}