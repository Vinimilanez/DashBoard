/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard.Service;

import br.com.powerrangers.Dashboard.model.Upload;
import br.com.powerrangers.Dashboard.repository.UploadRepository;
import br.com.powerrangers.Dashboard.repository.UploadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vinic
 */
@Service
public class UploadService {
    @Autowired
    private UploadRepository repository;
    
    public List<Upload> findAll(){
       return repository.findAll();
    }
    
    public Upload save(Upload download) {
        return repository.saveAndFlush(download); 
    }
    
     public int sizeUpload(){
        return repository.findAll().size();
    }
}
