package com.idat.EFLeonardoBravoHospedaje.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFLeonardoBravoHospedaje.modelo.Hospedaje;

@Repository
public interface HospedajeRepository extends JpaRepository<Hospedaje, Integer> {

}
