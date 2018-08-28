/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard.repository;


import br.com.powerrangers.Dashboard.model.Arquivo;
import br.com.powerrangers.Dashboard.model.Download;
import br.com.powerrangers.Dashboard.model.Usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vinic
 */
@Repository
public interface DownloadRepository  extends CrudRepository<Download,String>{
    Iterable<Download> findByarquivo(Arquivo arquivo);
    Iterable<Download> findByusuario(Usuario usuarios);
    public Download findByidDownload (int id_download);
}
