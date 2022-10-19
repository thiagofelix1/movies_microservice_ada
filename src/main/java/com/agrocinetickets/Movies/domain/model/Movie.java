package com.agrocinetickets.Movies.domain.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Movie {
    private String imdbID;
    private String title;
    private String year;
    private String genre;
    private String director;
    private String plot;
    private String poster;
    private String runtime;
    private String language;
    private String rated;
    private LocalDate deadline;

}
