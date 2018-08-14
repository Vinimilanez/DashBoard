/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard.model;

import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

/**
 *
 * @author vinic
 */
@Entity
public class Usuario {
    @Id
    @NotEmpty
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotEmpty
    private String nome, pais, lingua;
    @NotEmpty
    private int idade;
    @NotEmpty
    private String status;
    @ManyToOne
    private List<Acesso>Acessos;

    public List<Acesso> getAcessos() {
        return Acessos;
    }

    public void setAcessos(List<Acesso> Acessos) {
        this.Acessos = Acessos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLingua() {
        return lingua;
    }

    public void setLingua(String lingua) {
        this.lingua = lingua;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
