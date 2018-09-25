/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard.repository;

import br.com.powerrangers.Dashboard.model.Acesso;
import br.com.powerrangers.Dashboard.model.Download;
import br.com.powerrangers.Dashboard.model.Upload;
import br.com.powerrangers.Dashboard.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author vinic
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
       
   
    
}
