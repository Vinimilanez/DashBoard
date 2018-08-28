/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard.repository;

import br.com.powerrangers.Dashboard.model.Acesso;
import br.com.powerrangers.Dashboard.model.Arquivo;
import br.com.powerrangers.Dashboard.model.Download;
import br.com.powerrangers.Dashboard.model.Upload;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vinic
 */
@Repository
public interface ArquivoRepository extends CrudRepository<Arquivo,String> {

    
    
    public Arquivo findByidArquivo(int id_arquivo);  

}
