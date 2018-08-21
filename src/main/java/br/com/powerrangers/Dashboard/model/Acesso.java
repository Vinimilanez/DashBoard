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
    @NotEmpty
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_acesso;
    @NotEmpty
     @Column
    private Date data;
    @ManyToOne (fetch = FetchType.LAZY)
       @JoinColumn(name = "id_usuario")
    private Usuario usuarios;
    @ManyToOne (fetch = FetchType.LAZY)
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

    public long getId_acesso() {
        return id_acesso;
    }

    public void setId_acesso(long id_acesso) {
        this.id_acesso = id_acesso;
    }
    
    

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
