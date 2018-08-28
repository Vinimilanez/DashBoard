/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard.Service;

import br.com.powerrangers.Dashboard.model.Arquivo;
import br.com.powerrangers.Dashboard.repository.ArquivoRepository;
import br.com.powerrangers.Dashboard.repository.ArquivoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vinic
 */
@Service
public class ArquivoService {
    @Autowired
    private ArquivoRepository repository;
    
    public List<Arquivo> findAll(){
       return repository.findAll();
    }
    
     public Arquivo save(Arquivo arquivo) {
        return repository.saveAndFlush(arquivo); 
    }

}
