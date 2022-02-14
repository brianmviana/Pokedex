package dev.brianmviana.apis.pokedex.datasources.services.mappers;

import dev.brianmviana.apis.pokedex.datasources.services.data.response.TipoResponse;
import dev.brianmviana.apis.pokedex.entities.Tipo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TipoMapper {

    TipoMapper INSTANCE = Mappers.getMapper(TipoMapper.class);

    Tipo map(TipoResponse entity);

    List<Tipo> map(List<TipoResponse> entity);

}
