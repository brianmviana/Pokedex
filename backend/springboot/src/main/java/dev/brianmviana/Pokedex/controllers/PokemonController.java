package dev.brianmviana.Pokedex.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.brianmviana.Pokedex.models.Pokemon;
import dev.brianmviana.Pokedex.repositories.PokemonRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {
	
	private PokemonRepository repository;
	
	public PokemonController(PokemonRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public Flux<Pokemon> getAllPokemons(){
		return repository.findAll();
	}
	
	
	@GetMapping("/{id}")
	public Mono<ResponseEntity<Pokemon>> getPokemonMono(@PathVariable String id){
		return repository.findById(id)
				.map(pokemon -> ResponseEntity.ok(pokemon))
				.defaultIfEmpty(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<Pokemon> savePokemon(@RequestBody Pokemon pokemon){
		return repository.save(pokemon);
	}
	
}
