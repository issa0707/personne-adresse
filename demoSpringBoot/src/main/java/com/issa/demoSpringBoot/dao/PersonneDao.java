package com.issa.demoSpringBoot.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.issa.demoSpringBoot.beans.Personne;

public interface PersonneDao extends CrudRepository<Personne, Integer>{
	
	public List<Personne> findAll();

}
