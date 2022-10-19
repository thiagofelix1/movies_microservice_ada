package com.agrocinetickets.movies;

import com.agrocinetickets.movies.domain.model.Movie;
import com.agrocinetickets.movies.domain.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
@RequiredArgsConstructor
public class MoviesApplication {

	private final MovieRepository movieRepository;

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

//	@PostConstruct
//	public void post() {
//		movieRepository.save(Movie.builder()
//						.imdbId(String.valueOf(new Random().nextInt(999999999)))
//						.title("Inception")
//						.year("2010")
//						.rated("PG-13")
//						.genre("Action")
//						.director("Christopher Nolan")
//						.runtime("148 min")
//						.plot("sao paulo")
//						.language("English, Portuguese")
//						.poster("poster")
//						.deadline(LocalDate.now())
//						.build())
//				.subscribe();
//		Flux<Movie> flux = movieRepository.findAll();
//		flux.map(t -> {System.out.println(t); return t;}).subscribe();
//		System.out.println();
//	}

}
