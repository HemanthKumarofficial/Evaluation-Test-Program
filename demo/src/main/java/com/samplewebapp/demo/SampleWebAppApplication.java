package com.samplewebapp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@SpringBootApplication
@RestController
public class SampleWebAppApplication {
	String message = "Hemanth";
	public static void main(String[] args) {
		SpringApplication.run(SampleWebAppApplication.class, args);
	}	
	
	@GetMapping("/New")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Hello %s!", name);
	}
	
	@GetMapping("/old")
	public ModelAndView old () {
		ModelAndView hemanth =new ModelAndView();
		hemanth.setViewName("index.jsp");
		return hemanth;
	}
	@RequestMapping("/")
	public String welcome(ModelMap model) {
	    model.addAttribute("message", "Programmer Gate");
	    return "You web page created successfully";
	}
	
//	@RequestMapping("/")
//	public ModelAndView welcome("index.jsp") {
//	    ModelAndView model = new ModelAndView("/home");
//	    model.addObject("message", "this.message");
//	    return model;
//
//	}
//	
}

