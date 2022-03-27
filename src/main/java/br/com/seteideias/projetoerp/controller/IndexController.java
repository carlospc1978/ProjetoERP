package br.com.seteideias.projetoerp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

    @GetMapping("/produtos")
    public ModelAndView getProdutos(){
        ModelAndView modelAndView = new ModelAndView("index.html");
        return modelAndView;
    }

}
