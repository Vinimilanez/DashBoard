/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard.repository;

import br.com.powerrangers.Dashboard.model.Acesso;
import br.com.powerrangers.Dashboard.model.Arquivo;
import br.com.powerrangers.Dashboard.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vinic
 */
@Repository
public interface AcessoRepository extends CrudRepository <Acesso, String>{
    Iterable<Acesso> findByarquivo(Arquivo arquivo);
    Iterable<Acesso> findByusuario(Usuario usuarios);
    public Acesso findByidAcesso(int id_acesso);
    
}
