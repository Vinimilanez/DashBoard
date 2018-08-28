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
public class Download implements Serializable {

    @Id
    @NotEmpty
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idDownload;
    @NotEmpty
    @Column
    private Date data;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_arquivo")
    private Arquivo arquivo;
    @NotEmpty
    @Column
    private String status;

    public int getIdDownload() {
        return idDownload;
    }

    public void setIdDownload(int idDownload) {
        this.idDownload = idDownload;
    }

    

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
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
