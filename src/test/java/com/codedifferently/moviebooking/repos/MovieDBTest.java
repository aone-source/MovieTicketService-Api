package com.codedifferently.moviebooking.repos;

import com.codedifferently.moviebooking.movie.Movie;
import com.codedifferently.moviebooking.person.actor.Actor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

public class MovieDBTest {
    
    private Repository <Movie> MovieDataBase;
    private Movie testMovie;

    @BeforeEach
    public void setup()throws ParseException {
        MovieDataBase = new RepositoryImpl<>();
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        Actor actor1 = new Actor("Keira", "Knighley", format.parse("03-26-1985"));
        Actor actor2 = new Actor("Rosamund", "Pike", format.parse("01-27-1979"));

        //testMovie = new Movie ("Pride & Prejudice", )
    }

    @Test
    @DisplayName("Create New Movie")
    public void saveMovieTes01()  {
        String actual = MovieDataBase.save(testMovie).getId();
        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Update Movie")
    public void saveMovieTes02()  {
        testMovie.setId("save-"+3l);
        MovieDataBase.save(testMovie);
        Optional<Movie> MovieOptional = MovieDataBase.findById("save-"+3l);
        Assertions.assertTrue(MovieOptional.isPresent());

    }

    @Test
    @DisplayName("Find All")
    public void findAllTest()  {
        MovieDataBase.save(testMovie);
        List<Movie> actualList = MovieDataBase.findAll();
        Integer expected = 1;
        Integer actual = actualList.size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Delete")
    public void deleteTest(){
        Movie Movie = MovieDataBase.save(testMovie);
        String MovieID = Movie.getId();
        MovieDataBase.delete(MovieID);
        Optional<Movie> findMovie = MovieDataBase.findById(MovieID);
        Assertions.assertTrue(findMovie.isEmpty());
    }
}


    