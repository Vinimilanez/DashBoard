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
public class Acesso implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAcesso;
    @NotEmpty
    @Column
    private String data;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario usuarios;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_arquivo")
    private Arquivo arquivos;

    public Usuario getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario usuarios) {
        this.usuarios = usuarios;
    }

    public Arquivo getArquivos() {
        return arquivos;
    }

    public void setArquivos(Arquivo arquivos) {
        this.arquivos = arquivos;
    }

    public int getIdAcesso() {
        return idAcesso;
    }

    public void setIdAcesso(int idAcesso) {
        this.idAcesso = idAcesso;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    

}
