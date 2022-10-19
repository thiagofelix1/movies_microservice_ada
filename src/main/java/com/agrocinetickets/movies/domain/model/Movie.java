package com.agrocinetickets.movies.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Table("movie")
@Data
@AllArgsConstructor
@Builder
public class Movie {

    @Id
    @Column("agro_id")
    private Long agroId;

    @Column("imdb_id")
    private String imdbId;

    @Column("title")
    private String title;

    @Column("year")
    private String year;

    @Column("rated")
    private String rated;

    @Column("genre")
    private String genre;

    @Column("director")
    private String director;

    @Column("plot")
    private String plot;

    @Column("poster")
    private String poster;

    @Column("runtime")
    private String runtime;

    @Column("language")
    private String language;

    @Column("deadline")
    private LocalDate deadline;
}
