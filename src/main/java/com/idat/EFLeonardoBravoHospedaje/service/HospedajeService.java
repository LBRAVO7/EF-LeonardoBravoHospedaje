package com.idat.EFLeonardoBravoHospedaje.service;

import java.util.List;

import com.idat.EFLeonardoBravoHospedaje.dto.HospedajeDTO;

public interface HospedajeService {
	
	List<HospedajeDTO> listar();
	HospedajeDTO obtenerId(Integer id);
	void guardar(HospedajeDTO hospedaje);

}
