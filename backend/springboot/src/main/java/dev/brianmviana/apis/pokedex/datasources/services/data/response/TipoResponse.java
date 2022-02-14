package dev.brianmviana.apis.pokedex.datasources.services.data.response;

import javax.persistence.*;

@Entity
@Table(name = "tipo")
public class TipoResponse {

    @Id
    private Integer id;

    private String nome;

    public Integer getId() {
        return id;
    }

    public TipoResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoResponse setNome(String nome) {
        this.nome = nome;
        return this;
    }

}
