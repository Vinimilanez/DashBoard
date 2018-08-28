/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard.Service;

import br.com.powerrangers.Dashboard.model.Download;
import br.com.powerrangers.Dashboard.repository.DownloadRepository;
import br.com.powerrangers.Dashboard.repository.DownloadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vinic
 */
@Service
public class DownloadService {
    @Autowired
    private DownloadRepository repository;
    
    public List<Download> findAll(){
       return repository.findAll();
    }
    
    public Download save(Download download) {
        return repository.saveAndFlush(download); 
    }

}
