package com.agrocinetickets.Movies.application.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MovieRequest {
    private String imdbID;
    private LocalDate deadline;
}
