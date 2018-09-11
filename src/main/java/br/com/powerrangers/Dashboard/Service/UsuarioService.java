/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard.Service;

import br.com.powerrangers.Dashboard.model.Usuario;
import br.com.powerrangers.Dashboard.repository.UsuarioRepository;
import br.com.powerrangers.Dashboard.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vinic
 */
@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;
    
    public List<Usuario> findAll(){
       return repository.findAll();
    }
    
    public Usuario save(Usuario usuario) {
        return repository.save(usuario); 
    }
}
