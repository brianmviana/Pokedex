package dev.brianmviana.apis.pokedex.repositories;

import dev.brianmviana.apis.pokedex.entities.Pokemon;
import java.util.List;

public interface PokemonRepository {

    List<Pokemon> getAll();

    Pokemon getById(Integer id);

}
