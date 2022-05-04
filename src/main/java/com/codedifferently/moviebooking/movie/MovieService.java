package com.codedifferently.moviebooking.movie;

import com.codedifferently.moviebooking.common.Entity;
import com.codedifferently.moviebooking.person.actor.Actor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovieService extends Entity implements Search  {
    private List <Movie> movies;

    public MovieService() {
        this.movies = new ArrayList<>();
    }

    public Movie createMovies(){
        return null;
    }

    public void findMovieById(Long id){

    }

    public void updateMovie (){

    }

    public Boolean deleteMovie(Long id){
        return null;
    }

    @Override
    public String searchByTitle(List<Movie> movies) {
        return null;
    }

    @Override
    public Language searchByLanguage(List<Movie> movies) {
        return null;
    }

    @Override
    public Actor searchByActor(List<Movie> movies) {
        return null;
    }

    @Override
    public Genre searchByGenre(List<Movie> movies) {
        return null;
    }

    @Override
    public Date searchByReleaseDate(List<Movie> movies) {
        return null;
    }
}
