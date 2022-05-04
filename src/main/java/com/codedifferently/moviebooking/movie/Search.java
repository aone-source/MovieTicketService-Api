package com.codedifferently.moviebooking.movie;

import com.codedifferently.moviebooking.person.actor.Actor;

import java.util.Date;
import java.util.List;

public interface Search {

    String searchByTitle (List<Movie> movies);
    Language searchByLanguage (List<Movie> movies);
    Actor searchByActor (List<Movie> movies);
    Genre searchByGenre (List<Movie> movies);
    Date searchByReleaseDate (List<Movie> movies);
}

    public abstract class Entity {
        private Long id;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }
