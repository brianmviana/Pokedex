package dev.brianmviana.apis.pokedex.interactors;

import dev.brianmviana.apis.pokedex.entities.Pokemon;
import dev.brianmviana.apis.pokedex.repositories.PokemonRepository;
import org.springframework.stereotype.Service;

@Service
public class PokemonGetByIdUseCase {

    private final PokemonRepository pokemonRepository;

    public PokemonGetByIdUseCase(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public Pokemon execute(Integer id) {
        return pokemonRepository.getById(id);
    }

}
