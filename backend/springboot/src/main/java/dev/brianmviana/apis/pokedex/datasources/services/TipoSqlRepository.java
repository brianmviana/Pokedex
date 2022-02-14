package dev.brianmviana.apis.pokedex.datasources.services;

import dev.brianmviana.apis.pokedex.datasources.services.data.response.TipoResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TipoSqlRepository extends JpaRepository<TipoResponse, Integer> {

    @Query(value = "SELECT * FROM tipo t WHERE t.id IN (SELECT id_tipo FROM pokemon_tipo WHERE id_pokemon = ?1)", nativeQuery = true)
    List<TipoResponse> findTiposByPokemonId(Integer pokemonId);

}
