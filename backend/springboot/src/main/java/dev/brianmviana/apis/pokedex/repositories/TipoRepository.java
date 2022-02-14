package dev.brianmviana.apis.pokedex.repositories;

import dev.brianmviana.apis.pokedex.entities.Tipo;

import java.util.List;

public interface TipoRepository {

    List<Tipo> getByPokemonId(Integer pokemonId);

}
