package dev.brianmviana.apis.pokedex.datasources.services;

import dev.brianmviana.apis.pokedex.datasources.services.data.response.PokemonResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonMySqlRepository extends JpaRepository<PokemonResponse, Integer> {

}
