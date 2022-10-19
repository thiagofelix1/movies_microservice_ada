package com.agrocinetickets.Movies;

import com.agrocinetickets.Movies.domain.model.Movie;
import com.agrocinetickets.Movies.domain.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

import javax.annotation.PostConstruct;
import java.util.Random;

@SpringBootApplication
@RequiredArgsConstructor
public class MoviesApplication {

	private final MovieRepository movieRepository;

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}
	@PostConstruct
	public void post() {
		movieRepository.save(Movie.builder()
						.imdbId(String.valueOf(new Random().nextInt(999999999)))
						.title("Inception")
						.year("2010")
						.rated("PG-13")
						.genre("Action")
						.director("Christopher Nolan")
						.runtime("148 min")
						.plot("A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O., but his tragic past may doom the project and his team to disaster.")
						.language("English, Portuguese")
						.poster("poster")
						.build())
				.subscribe();
		Flux<Movie> flux = movieRepository.findAll();
		flux.map(t -> {System.out.println(t); return t;}).subscribe();
		System.out.println();
	}

}
