/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard.repository;

import br.com.powerrangers.Dashboard.model.Acesso;
import br.com.powerrangers.Dashboard.model.Arquivo;
import br.com.powerrangers.Dashboard.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vinic
 */
@Repository
public interface AcessoRepository extends JpaRepository<Acesso, Long>{
    
     @Query(value = "SELECT count(id_acesso) FROM acesso where MONTH(data) =MONTH(NOW()) ", nativeQuery = true)
     int findByCountAcessos();
     
     @Query(value = "SELECT count(id_acesso) FROM acesso where MONTH(data) =MONTH(NOW())-1 ", nativeQuery = true)
     int findByCountAcessosPassados();
    
}
