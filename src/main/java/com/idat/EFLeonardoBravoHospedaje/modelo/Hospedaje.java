package com.idat.EFLeonardoBravoHospedaje.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="hospedaje")
@Entity
public class Hospedaje {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idHospedaje;
	private String nombre;
}
