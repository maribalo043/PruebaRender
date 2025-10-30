package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GeneralController {
	
	@GetMapping("/")
	public ModelAndView paginaInicio() {
		ModelAndView model = new ModelAndView();
        model.setViewName("index");
        return model;
	}

}
