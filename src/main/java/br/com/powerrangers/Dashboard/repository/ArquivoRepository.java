/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard.repository;

import br.com.powerrangers.Dashboard.model.Arquivo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author vinic
 */
public interface ArquivoRepository extends CrudRepository<Arquivo,Long> {
    Arquivo findByid_arquivo(long id_arquivo);
     
}
