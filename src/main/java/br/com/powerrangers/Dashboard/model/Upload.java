/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

/**
 *
 * @author vinic
 */
@Entity
public class Upload implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUpload;
    @Column
    private String data;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_arquivo")
    private Arquivo arquivo;
    @NotEmpty
    @Column
    private String status;

    public int getIdUpload() {
        return idUpload;
    }

    public void setIdUpload(int idUpload) {
        this.idUpload = idUpload;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Arquivo getArquivo() {
        return arquivo;
    }

    public void setArquivo(Arquivo arquivo) {
        this.arquivo = arquivo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
