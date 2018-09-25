/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard.Service;

import br.com.powerrangers.Dashboard.model.Acesso;
import br.com.powerrangers.Dashboard.repository.AcessoRepository;
import br.com.powerrangers.Dashboard.repository.AcessoRepository;
import java.util.Date;
import java.util.List;
import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

/**
 *
 * @author vinic
 */
@Service
public class AcessoService {
    @Autowired
    private AcessoRepository repository;
    
    public List<Acesso> findAll(){
       return repository.findAll();
    }
    
    
    
   
    
     public Acesso save(Acesso acesso) {
        return repository.saveAndFlush(acesso); 
    }
     
     
      public int ResultGrafico(){
          
        return repository.findByCountAcessos();
    }
      
       public int ResultGrafico2(){
          
        return repository.findByCountAcessosPassados();
    }
      
     

}
