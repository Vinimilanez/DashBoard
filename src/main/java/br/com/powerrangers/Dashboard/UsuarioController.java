/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard;

import br.com.powerrangers.Dashboard.Service.UsuarioService;
import br.com.powerrangers.Dashboard.model.Usuario;
import br.com.powerrangers.Dashboard.repository.UsuarioRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author vinic
 */
@Controller
public class UsuarioController {
    
    @Autowired
    public UsuarioService us;
    
    
    @RequestMapping("/usuario")
    public String carregaUsuario(){
        return "cad";
    }
    
    @RequestMapping(value = "/userAdd", method = RequestMethod.POST)
    public ModelAndView novoCadastro(@Valid Usuario usuario, final BindResult result, Model model,RedirectAttributes redirectAttributes){
       us.save(usuario);
       ModelAndView modelAndView = new ModelAndView("redirect:/usuario");
       
       return modelAndView;
    }
}
