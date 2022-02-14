package dev.brianmviana.apis.pokedex.transportlayers;

import dev.brianmviana.apis.pokedex.entities.Pokemon;
import dev.brianmviana.apis.pokedex.interactors.PokemonGetAllUseCase;
import dev.brianmviana.apis.pokedex.interactors.PokemonGetByIdUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonApi {

    private final PokemonGetAllUseCase pokemonGetAllUseCase;
    private final PokemonGetByIdUseCase pokemonGetByIdUseCase;

    public PokemonApi(PokemonGetAllUseCase pokemonGetAllUseCase, PokemonGetByIdUseCase pokemonGetByIdUseCase) {
        this.pokemonGetAllUseCase = pokemonGetAllUseCase;
        this.pokemonGetByIdUseCase = pokemonGetByIdUseCase;
    }

    @GetMapping
    public ResponseEntity<List<Pokemon>> getAll() {
        return ResponseEntity.ok(this.pokemonGetAllUseCase.execute());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pokemon> getById(@PathVariable Integer id) {
        var pokemon = this.pokemonGetByIdUseCase.execute(id);
        return (pokemon != null) ? ResponseEntity.ok(pokemon) : ResponseEntity.noContent().build();
    }

}
