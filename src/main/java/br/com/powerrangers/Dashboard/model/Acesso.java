/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard.model;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

/**
 *
 * @author vinic
 */
@Entity
public class Acesso {

    @Id
    @NotEmpty
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotEmpty
    private Date data;
    @OneToMany
    private Usuario usuarios;
    @OneToMany
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
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
