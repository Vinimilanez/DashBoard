/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard.controller;

import br.com.powerrangers.Dashboard.Service.AcessoService;
import br.com.powerrangers.Dashboard.Service.ArquivoService;
import br.com.powerrangers.Dashboard.Service.DownloadService;
import br.com.powerrangers.Dashboard.Service.UploadService;
import br.com.powerrangers.Dashboard.Service.UsuarioService;
import br.com.powerrangers.Dashboard.model.Arquivo;
import br.com.powerrangers.Dashboard.model.Usuario;
import br.com.powerrangers.Dashboard.repository.AcessoRepository;
import br.com.powerrangers.Dashboard.repository.ArquivoRepository;
import br.com.powerrangers.Dashboard.repository.DownloadRepository;
import br.com.powerrangers.Dashboard.repository.UploadRepository;
import br.com.powerrangers.Dashboard.repository.UsuarioRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author vinic
 */
@Controller
public class indexController {

    @Autowired
    private ArquivoService as;
    
    @Autowired
    private AcessoService acs;

    @Autowired
    private UsuarioService us;

    @Autowired
    private DownloadService ds;

    @Autowired
    private UploadService ups;
    
    @Autowired
    private ArquivoRepository ar;
    
    @Autowired
    private AcessoRepository acr;

    @Autowired
    private UsuarioRepository ur;

    @Autowired
    private DownloadRepository dr;

    @Autowired
    private UploadRepository upr;

   //-----------------------INDEX-MAPPING---------------------------------------
    
    @GetMapping("/index")
	public ModelAndView findAll() {
		
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("usuarios", us.findAll());
                
		mv.addObject("arquivos", as.findAll());
		

		return mv;
	}
        
    
    
    
    

   //---------------------------USER-CODE---------------------------------------
    
    
    
        @PostMapping("/saveUser")
	public ModelAndView save(@Valid Usuario usuario, BindingResult result) {
		
		if(result.hasErrors()) {
			return add(usuario);
		}
		
		us.save(usuario);
		
		return findAll();
	}
        
        
        @GetMapping("/cadUser")
	public ModelAndView add(Usuario usuario) {
		
		ModelAndView mv = new ModelAndView("/cadUser");
		mv.addObject("usuario", usuario);
		
		return mv;
	}
        
        
        
        
    //---------------------------FILE-CODE--------------------------------------
        
        @PostMapping("/saveArquivo")
	public ModelAndView save(@Valid Arquivo arquivo, BindingResult result) {
		
		if(result.hasErrors()) {
			return add(arquivo);
		}
		
		as.save(arquivo);
		
		return findAll();
	}    
        
        @GetMapping("/cadArquivo")
	public ModelAndView add(Arquivo arquivo) {
		
		ModelAndView mv = new ModelAndView("/cadArquivo");
		mv.addObject("arquivo", arquivo);
		
		return mv;
	}


}
