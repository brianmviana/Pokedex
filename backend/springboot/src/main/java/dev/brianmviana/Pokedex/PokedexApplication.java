package dev.brianmviana.Pokedex;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;

import dev.brianmviana.Pokedex.models.Pokemon;
import dev.brianmviana.Pokedex.repositories.PokemonRepository;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class PokedexApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokedexApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(ReactiveMongoOperations operation, PokemonRepository pokemonRepository) {
		return args -> {
			Flux<Pokemon> pokemonFlux = Flux.just(
					new Pokemon(null, "Charmander", "Fire", "Ember", 6.09),
					new Pokemon(null, "Bulbasaur", "Seed", "OverGrow", 6.09)
			).flatMap(pokemonRepository::save);
			
			pokemonFlux.thenMany(
				pokemonRepository.findAll()
			).subscribe(System.out::println);	
		};
	}

}
