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
import br.com.powerrangers.Dashboard.model.Acesso;
import br.com.powerrangers.Dashboard.model.Arquivo;
import br.com.powerrangers.Dashboard.model.Download;
import br.com.powerrangers.Dashboard.model.Upload;
import br.com.powerrangers.Dashboard.model.Usuario;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    

   //-----------------------INDEX-MAPPING---------------------------------------
    
    
    @GetMapping("/index")
	public ModelAndView findAll() {
		
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("usuarios", us.findAll());
                mv.addObject("usuariosestatisticas", us.sizeUser());
                mv.addObject("arquivosestatisticas", as.sizeArquivo());
                mv.addObject("downloadsestatisticas", ds.sizeDownload());
                mv.addObject("uploadsestatisticas", ups.sizeUpload());
		mv.addObject("arquivos", as.findAll());
                mv.addObject("uploads",ups.findAll());
                mv.addObject("downloads",ds.findAll());
                mv.addObject("acessos", acs.findAll());
                mv.addObject("acessosGrafico", acs.ResultGrafico());
                mv.addObject("acessosGrafico2", acs.ResultGrafico2());
             
		

		return mv;
	}
        
    
    
    
    

   //---------------------------USER-CONTROLLER---------------------------------
    
    
    
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
        
        
        
        
    //---------------------------FILE-CONTROLLER--------------------------------
        
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
    //-----------------------------UPLOAD-CONTROLLER----------------------------
        
        @PostMapping("/saveUpload")
        public ModelAndView save (@Valid Upload upload,@Valid Usuario usuario,@Valid Arquivo arquivo, BindingResult result){
            if (result.hasErrors()) {
                return add(upload);

                 
            }
            ups.save(upload);
            
            return findAll();
        
        }
        
        @GetMapping("cadUpload")
        public ModelAndView add(Upload upload){
           
            ModelAndView mv = new ModelAndView("/cadUpload");
            mv.addObject("upload",upload);
            mv.addObject("usuario",us.findAll());
            mv.addObject("arquivo",as.findAll());
            
            return mv;
        }
    //-----------------------------ACESSO-CONTROLLER----------------------------
        
        @PostMapping("/saveAcesso")
        public ModelAndView save (@Valid Acesso acesso,@Valid Usuario usuario,@Valid Arquivo arquivo , BindingResult result){
            if (result.hasErrors()) {
                return add(acesso);
            }
            acs.save(acesso);
            
            return findAll();
        
        }
        
        @GetMapping("cadAcesso")
        public ModelAndView add(Acesso acesso){
           
            ModelAndView mv = new ModelAndView("/cadAcesso");
            mv.addObject("acesso",acesso);
            mv.addObject("usuario",us.findAll());
            mv.addObject("arquivo",as.findAll());
            
            return mv;
        }
    //-----------------------------DOWNLOAD-CONTROLLER--------------------------
        
        @PostMapping("/saveDownload")
        public ModelAndView save (@Valid Download download,@Valid Usuario usuario,@Valid Arquivo arquivo , BindingResult result){
            if (result.hasErrors()) {
                return add(download);
            }
            ds.save(download);
            
            return findAll();
        
        }
        
        @GetMapping("cadDownload")
        public ModelAndView add(Download download){
           
            ModelAndView mv = new ModelAndView("/cadDownload");
            mv.addObject("download",download);
            mv.addObject("usuario",us.findAll());
            mv.addObject("arquivo",as.findAll());
            
            return mv;
        }    
}
