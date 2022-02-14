package dev.brianmviana.apis.pokedex.datasources;

import dev.brianmviana.apis.pokedex.datasources.services.PokemonMySqlRepository;
import dev.brianmviana.apis.pokedex.datasources.services.mappers.PokemonMapper;
import dev.brianmviana.apis.pokedex.entities.Pokemon;
import dev.brianmviana.apis.pokedex.repositories.PokemonRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PokemonDataSource implements PokemonRepository {

    private final PokemonMySqlRepository pokemonMySqlRepository;

    public PokemonDataSource(PokemonMySqlRepository pokemonMySqlRepository) {
        this.pokemonMySqlRepository = pokemonMySqlRepository;
    }

    @Override
    public List<Pokemon> getAll() {
        var pokemonsResponse = pokemonMySqlRepository.findAll();
        var pokemons = new ArrayList<Pokemon>();
        for (var pokemon : pokemonsResponse) {
            pokemons.add(PokemonMapper.INSTANCE.map(pokemon));
        }
        return pokemons;
    }

    // TODO - Atualizar metodo para remover o retorno null
    @Override
    public Pokemon getById(Integer id) {
        var pokemonReponse = pokemonMySqlRepository.getById(id);
        if (pokemonReponse != null) {
            return PokemonMapper.INSTANCE.map(pokemonReponse);
        }
        return null;
    }

}
