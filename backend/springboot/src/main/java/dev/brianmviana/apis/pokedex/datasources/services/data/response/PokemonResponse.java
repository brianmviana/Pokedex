package dev.brianmviana.apis.pokedex.datasources.services.data.response;

import javax.persistence.*;

@Entity
@Table(name = "pokemon")
public class PokemonResponse {

    @Id
    private Integer id;

    private String nome;

    private String numero;

    @OneToOne
    @JoinColumn(name = "geracao_id", referencedColumnName = "id")
    private GeracaoResponse geracao;

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

    public GeracaoResponse getGeracao() {
        return geracao;
    }

    public PokemonResponse setGeracao(GeracaoResponse geracao) {
        this.geracao = geracao;
        return this;
    }

}
