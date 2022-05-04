package com.codedifferently.moviebooking.movie;

import com.codedifferently.moviebooking.common.Entity;
import com.codedifferently.moviebooking.person.actor.Actor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie extends Entity {
    private String title;
    private List<Actor> cast;
    private String description;
    private Integer durationInMins;
    private Language language;
    private Date releaseDate;
    private Country country;
    private Genre genre;

    public Movie(String title, List<Actor> cast, String description, Integer durationInMins,
                 Language language, Date releaseDate, Country country, Genre genre) {
        this.title = title;
        this.cast = new ArrayList<>();
        this.description = description;
        this.durationInMins = durationInMins;
        this.language = language;
        this.releaseDate = releaseDate;
        this.country = country;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Actor> getCast() {
        return cast;
    }

    public void setCast(List<Actor> cast) {
        this.cast = cast;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDurationInMins() {
        return durationInMins;
    }

    public void setDurationInMins(Integer durationInMins) {
        this.durationInMins = durationInMins;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
