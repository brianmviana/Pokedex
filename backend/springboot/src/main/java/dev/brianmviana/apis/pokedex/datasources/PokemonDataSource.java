package dev.brianmviana.apis.pokedex.datasources;

import dev.brianmviana.apis.pokedex.datasources.services.PokemonSqlRepository;
import dev.brianmviana.apis.pokedex.datasources.services.mappers.PokemonMapper;
import dev.brianmviana.apis.pokedex.entities.Pokemon;
import dev.brianmviana.apis.pokedex.repositories.PokemonRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PokemonDataSource implements PokemonRepository {

    private final PokemonSqlRepository pokemonSqlRepository;
    private final TipoDataSource tipoDataSource;

    public PokemonDataSource(PokemonSqlRepository pokemonSqlRepository, TipoDataSource tipoDataSource) {
        this.pokemonSqlRepository = pokemonSqlRepository;
        this.tipoDataSource = tipoDataSource;
    }

    @Override
    public List<Pokemon> getAll() {
        var pokemons = PokemonMapper.INSTANCE.map(pokemonSqlRepository.findAll());
        for (var pokemon : pokemons) { pokemon.setTipo(this.tipoDataSource.getByPokemonId(pokemon.getId())); }
        return pokemons;
    }

    // TODO - Atualizar metodo para remover o retorno null
    @Override
    public Pokemon getById(Integer id) {
        var pokemonResponse = pokemonSqlRepository.findById(id);
        if (!pokemonResponse.isEmpty()) {
            var pokemon = PokemonMapper.INSTANCE.map(pokemonResponse.get());
            pokemon.setTipo(this.tipoDataSource.getByPokemonId(id));
            return pokemon;
        }
        return null;
    }

}
