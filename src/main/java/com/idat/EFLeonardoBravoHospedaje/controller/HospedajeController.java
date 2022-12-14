package com.idat.EFLeonardoBravoHospedaje.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFLeonardoBravoHospedaje.dto.HospedajeDTO;
import com.idat.EFLeonardoBravoHospedaje.service.HospedajeService;



@Controller
@RequestMapping("/api/hospedaje/v1")
public class HospedajeController {
	@Autowired
	private HospedajeService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<HospedajeDTO> listar() {
		return service.listar();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody HospedajeDTO porId(@PathVariable Integer id) {
		return service.obtenerId(id);
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody HospedajeDTO dto) {
		service.guardar(dto);
	}
	
	

}
