package dev.brianmviana.apis.pokedex.entities;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {

    private Integer id;

    private String nome;

    private String numero;

    private Geracao geracao;

    private List<Tipo> tipo = new ArrayList<>();

    private List<Tipo> fraquezas = new ArrayList<>();;

//    private Double altura;
//    private Double peso;
//    private String habilidades;


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

    public List<Tipo> getFraquezas() {
        return fraquezas;
    }

    public Pokemon setFraquezas(List<Tipo> fraquezas) {
        this.fraquezas = fraquezas;
        return this;
    }

    public Geracao getGeracao() {
        return geracao;
    }

    public Pokemon setGeracao(Geracao geracao) {
        this.geracao = geracao;
        return this;
    }

}
