package com.rajat.movieinfoservice.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajat.movieinfoservice.Models.MovieInfoModel;

@RestController
@RequestMapping("movies")
public class MovieInfoController {
    
    @RequestMapping("/{movieId}")
    public MovieInfoModel getMovieInfo(@PathVariable("movieId") String movieId){
        return new MovieInfoModel(movieId, "Bahubali", "Top Grossing");
    }
}
