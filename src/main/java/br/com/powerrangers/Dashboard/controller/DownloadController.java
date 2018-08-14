/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard.controller;

import br.com.powerrangers.Dashboard.model.Download;
import br.com.powerrangers.Dashboard.model.Usuario;
import br.com.powerrangers.Dashboard.repository.ArquivoRepository;
import br.com.powerrangers.Dashboard.repository.DownloadRepository;
import br.com.powerrangers.Dashboard.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author vinic
 */
@Controller
public class DownloadController {
    @Autowired
    DownloadRepository dr;
    
    @Autowired
    ArquivoRepository ar;
    
    @Autowired
    UsuarioRepository ur;
    
    @RequestMapping(value="/downloads",method = RequestMethod.POST)
    public String download (Download download){
       dr.save(download);
       return "redirect:/donloads";
    }
    
    @RequestMapping(value="/{id}",method =RequestMethod.GET)
    public ModelAndView detalhesDownload(@PathVariable("id")long id){
    Download down = dr.findByid(id);
    ModelAndView mv = new ModelAndView();
    mv.addObject("Download",down);
    Iterable <Usuario> usu = ur.findBydownload(download);
    }
}
