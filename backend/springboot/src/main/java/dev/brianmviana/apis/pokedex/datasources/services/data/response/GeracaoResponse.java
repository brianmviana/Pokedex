package dev.brianmviana.apis.pokedex.datasources.services.data.response;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "geracao")
public class GeracaoResponse {

    @Id
    private Integer id;

    private String nome;

    private String regiao;

    public Integer getId() {
        return id;
    }

    public GeracaoResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public GeracaoResponse setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getRegiao() {
        return regiao;
    }

    public GeracaoResponse setRegiao(String regiao) {
        this.regiao = regiao;
        return this;
    }

}
