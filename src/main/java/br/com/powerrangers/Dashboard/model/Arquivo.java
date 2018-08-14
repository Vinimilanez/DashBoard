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
public class Arquivo {

    @Id
    @NotEmpty
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotEmpty
    private String nome;
    @NotEmpty
    private String status;
    @ManyToOne
    private List<Acesso>acessos;
    @ManyToOne
    private List<Download>download;
    @OneToOne
    private Upload upload;

    public List<Acesso> getAcessos() {
        return acessos;
    }

    public void setAcessos(List<Acesso> acessos) {
        this.acessos = acessos;
    }

    public List<Download> getDownload() {
        return download;
    }

    public void setDownload(List<Download> download) {
        this.download = download;
    }

    public Upload getUpload() {
        return upload;
    }

    public void setUpload(Upload upload) {
        this.upload = upload;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
