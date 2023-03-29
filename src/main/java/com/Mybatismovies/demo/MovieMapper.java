package com.Mybatismovies.demo;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MovieMapper {
    @Select("SELECT * FROM movies where publishedYear = #{publishedYear}")
    List<Movie> findByPublishedYear(String publishedYear);
}
