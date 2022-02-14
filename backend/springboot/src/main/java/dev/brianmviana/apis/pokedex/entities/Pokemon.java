package dev.brianmviana.apis.pokedex.entities;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {

    private Integer id;

    private String nome;

    private String numero;

    private List<Tipo> tipo = new ArrayList<>();

    private String geracao;

//    private String habilidades;
//    private String Fraquezas;
//    private Double altura;
//    private Double peso;

    public Integer getId() {
        return id;
    }

    public Pokemon setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Pokemon setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public Pokemon setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public List<Tipo> getTipo() {
        return tipo;
    }

    public Pokemon setTipo(Tipo tipo) {
        this.tipo.add(tipo);
        return this;
    }

    public Pokemon setTipo(List<Tipo> tipo) {
        this.tipo = tipo;
        return this;
    }

    public String getGeracao() {
        return geracao;
    }

    public Pokemon setGeracao(String geracao) {
        this.geracao = geracao;
        return this;
    }

}
