package dev.brianmviana.apis.pokedex.entities;

public class Tipo {

    private Integer id;

    private String nome;

    public Integer getId() {
        return id;
    }

    public Tipo setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Tipo setNome(String nome) {
        this.nome = nome;
        return this;
    }
}
