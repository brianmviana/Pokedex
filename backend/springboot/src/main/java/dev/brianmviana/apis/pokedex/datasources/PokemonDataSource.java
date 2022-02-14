package dev.brianmviana.apis.pokedex.datasources;

import dev.brianmviana.apis.pokedex.entities.Geracao;
import dev.brianmviana.apis.pokedex.entities.Pokemon;
import dev.brianmviana.apis.pokedex.entities.Tipo;
import dev.brianmviana.apis.pokedex.repositories.PokemonRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import static java.util.Arrays.asList;

@Repository
public class PokemonDataSource implements PokemonRepository {

    @Override
    public List<Pokemon> getAll() {
        return pokemons;
    }

    // TODO - Atualizar metodo para remover o retorno null
    @Override
    public Pokemon getById(Integer id) {
        for (Pokemon pokemon: pokemons) {
            if (pokemon.getId().equals(id)){
                return pokemon;
            }
        }
        return null;
    }

    /** A implementação a baixo esta sendo ultilizada apenas para teste, enquanto o metodo de consulta a base de dados não é implementado **/
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

}
