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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUsuario;
    @NotEmpty
    @Column
    private String nome;
    @NotEmpty
    @Column
    private String pais;
    @NotEmpty
    @Column
    private String lingua;
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public Usuario(int idUsuario, String nome, String pais, String lingua, int idade, String status, List<Acesso> acessos, List<Download> downloads, List<Upload> upload) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.pais = pais;
        this.lingua = lingua;
        this.idade = idade;
        this.status = status;
        this.acessos = acessos;
        this.downloads = downloads;
        this.upload = upload;
    }

    public Usuario() {
    }
    
}
