package dev.brianmviana.apis.pokedex.transportlayers;

import dev.brianmviana.apis.pokedex.entities.Pokemon;
import dev.brianmviana.apis.pokedex.entities.Tipo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Arrays.asList;
import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonApi {

    private List<Pokemon> pokemons = asList(
            new Pokemon()
                    .setId(1)
                    .setNome("Charmander")
                    .setNumero("004")
                    .setTipo(
                            new Tipo()
                                    .setId(7)
                                    .setNome("Fogo")
                    )
    );

    @GetMapping
    public ResponseEntity<List<Pokemon>> getAll() {
        return ResponseEntity.ok(pokemons);
    }

}
