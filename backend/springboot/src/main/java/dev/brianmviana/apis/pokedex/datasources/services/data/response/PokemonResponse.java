package dev.brianmviana.apis.pokedex.datasources.services.data.response;

import javax.persistence.*;

@Entity
@Table(name = "pokemon")
public class PokemonResponse {

    @Id
    private Integer id;

    private String nome;

    private String numero;

    private String geracao;

    public Integer getId() {
        return id;
    }

    public PokemonResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public PokemonResponse setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public PokemonResponse setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public String getGeracao() {
        return geracao;
    }

    public PokemonResponse setGeracao(String geracao) {
        this.geracao = geracao;
        return this;
    }

}
