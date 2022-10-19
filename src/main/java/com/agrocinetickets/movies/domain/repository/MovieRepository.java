package com.agrocinetickets.movies.domain.repository;

import com.agrocinetickets.movies.domain.model.Movie;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends ReactiveCrudRepository<Movie, Long> {
}
