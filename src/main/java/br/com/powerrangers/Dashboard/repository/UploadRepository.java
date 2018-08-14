/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard.repository;

import br.com.powerrangers.Dashboard.model.Upload;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author vinic
 */
public interface UploadRepository extends CrudRepository<Upload, String> {
     Upload findByid(long id);
}
