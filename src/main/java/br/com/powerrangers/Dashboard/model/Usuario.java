/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

/**
 *
 * @author vinic
 */
@Entity
public class Usuario implements Serializable {

    @Id
    @NotEmpty
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_usuario;
    @NotEmpty
    @Column
    private String nome;
    @NotEmpty
    @Column
    private String pais;
    @NotEmpty
    @Column
    private String lingua;
    @NotEmpty
    @Column
    private int idade;
    @NotEmpty
    @Column
    private String status;

    @OneToMany(fetch = FetchType.LAZY) 
    private List<Acesso> acessos;
    @OneToMany(fetch = FetchType.LAZY) 
    private List<Download> downloads;
    @OneToMany(fetch = FetchType.LAZY) 
    private List<Upload> upload;

    public List<Upload> getUpload() {
        return upload;
    }

    public void setUpload(List<Upload> upload) {
        this.upload = upload;
    }

    public List<Acesso> getAcessos() {
        return acessos;
    }

    public void setAcessos(List<Acesso> acessos) {
        this.acessos = acessos;
    }

    public List<Download> getDownloads() {
        return downloads;
    }

    public void setDownloads(List<Download> downloads) {
        this.downloads = downloads;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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
