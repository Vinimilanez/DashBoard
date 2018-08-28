/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard;

import br.com.powerrangers.Dashboard.model.Arquivo;
import br.com.powerrangers.Dashboard.model.Usuario;
import br.com.powerrangers.Dashboard.repository.ArquivoRepository;
import br.com.powerrangers.Dashboard.repository.UsuarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author vinic
 */
@Controller
public class indexController {
    UsuarioRepository ur;
    ArquivoRepository ar;
    @RequestMapping("/")
    public ModelAndView index() {
        
        ModelAndView mv = new ModelAndView("index");
        
        Iterable<Usuario> usuario  = ur.findAll();
        mv.addObject("usuario",usuario);
        
        
        return mv;
    }

   
}
