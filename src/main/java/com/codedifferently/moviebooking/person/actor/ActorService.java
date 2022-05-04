package com.codedifferently.moviebooking.person.actor;

import com.codedifferently.moviebooking.common.Entity;
import com.codedifferently.moviebooking.movie.Genre;
import com.codedifferently.moviebooking.movie.Language;
import com.codedifferently.moviebooking.movie.Movie;
import com.codedifferently.moviebooking.movie.Search;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActorService extends Entity implements Search {

    private List <Actor> actors;

    public ActorService() {
        this.actors = new ArrayList<>();
    }

    public Actor createActors(){
        return null;
    }

    public void findActorById(Long id){

    }

    public void updateActor (){

    }

    public Boolean deleteActor(Long id){
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

