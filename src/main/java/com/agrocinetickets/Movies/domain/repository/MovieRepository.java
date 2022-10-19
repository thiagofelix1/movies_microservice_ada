package com.agrocinetickets.Movies.domain.repository;

import com.agrocinetickets.Movies.domain.model.Movie;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MovieRepository {
    Movie save(Movie movie);

    List<Movie> findAll();

    Optional<Movie> findById(UUID id);

    void delete(UUID id);
}
