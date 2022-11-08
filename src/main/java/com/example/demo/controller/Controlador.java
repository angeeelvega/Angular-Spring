package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controlador {
	
	
	@GetMapping("/nombre")
	public String nombreSitio(){
		return "TechCamp seguros bolivar";
		
	}
	
	@GetMapping("/descripcion")
	public String descripcionSitio(){
		return "Esta es la descripcion";
		
	}
	
	
}
