package dev.brianmviana.apis.pokedex.datasources;

import dev.brianmviana.apis.pokedex.datasources.services.TipoSqlRepository;
import dev.brianmviana.apis.pokedex.datasources.services.mappers.TipoMapper;
import dev.brianmviana.apis.pokedex.entities.Tipo;
import dev.brianmviana.apis.pokedex.repositories.TipoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TipoDataSource implements TipoRepository {

    private final TipoSqlRepository tipoSqlRepository;

    public TipoDataSource(TipoSqlRepository tipoSqlRepository) {
        this.tipoSqlRepository = tipoSqlRepository;
    }

    @Override
    public List<Tipo> getByPokemonId(Integer pokemonId) {
        var tiposResponse = tipoSqlRepository.findTiposByPokemonId(pokemonId);
        if (!tiposResponse.isEmpty()) {
            return TipoMapper.INSTANCE.map(tiposResponse);
        }
        return null;
    }

}
