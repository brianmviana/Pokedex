package dev.brianmviana.apis.pokedex.interactors;

import dev.brianmviana.apis.pokedex.entities.Pokemon;
import dev.brianmviana.apis.pokedex.repositories.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonGetAllUseCase {

    private final PokemonRepository pokemonRepository;

    public PokemonGetAllUseCase(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public List<Pokemon> execute() {
        return pokemonRepository.getAll();
    }

}
