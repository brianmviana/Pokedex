package dev.brianmviana.apis.pokedex.transportlayers;

import dev.brianmviana.apis.pokedex.entities.Geracao;
import dev.brianmviana.apis.pokedex.entities.Pokemon;
import dev.brianmviana.apis.pokedex.entities.Tipo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
                .setNome("Bulbasaur")
                .setNumero("001")
                .setTipo(
                    new Tipo()
                        .setId(10)
                        .setNome("Planta")
                ).setTipo(
                    new Tipo()
                        .setId(14)
                        .setNome("Venenoso")
                )
                .setGeracao(Geracao.GERACAO_1.toString())
            ,
            new Pokemon()
                .setId(4)
                .setNome("Charmander")
                .setNumero("004")
                .setTipo(
                    new Tipo()
                        .setId(7)
                        .setNome("Fogo")
                )
                .setGeracao(Geracao.GERACAO_1.toString())
            ,
            new Pokemon()
                .setId(7)
                .setNome("Squirtle")
                .setNumero("007")
                .setTipo(
                    new Tipo()
                        .setId(18)
                        .setNome("Agua")
                )
                .setGeracao(Geracao.GERACAO_1.toString())
    );

    @GetMapping
    public ResponseEntity<List<Pokemon>> getAll() {
        return ResponseEntity.ok(pokemons);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pokemon> getById(@PathVariable Integer id) {
        for (Pokemon pokemon: pokemons) {
            if (pokemon.getId().equals(id)){
                return ResponseEntity.ok(pokemon);
            }
        }
        return ResponseEntity.noContent().build();
    }

}
