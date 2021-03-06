package dev.brianmviana.apis.pokedex.datasources.services.mappers;

import dev.brianmviana.apis.pokedex.datasources.services.data.response.PokemonResponse;
import dev.brianmviana.apis.pokedex.entities.Pokemon;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PokemonMapper {

    PokemonMapper INSTANCE = Mappers.getMapper(PokemonMapper.class);

    Pokemon map(PokemonResponse entity);

}
