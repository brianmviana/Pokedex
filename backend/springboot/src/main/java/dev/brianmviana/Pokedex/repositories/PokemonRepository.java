package dev.brianmviana.Pokedex.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import dev.brianmviana.Pokedex.models.Pokemon;

public interface PokemonRepository extends ReactiveMongoRepository<Pokemon, String>{

}
