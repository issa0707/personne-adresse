package com.issa.demoSpringBoot.manager;

import java.util.List;

import com.issa.demoSpringBoot.beans.Personne;

public interface PersonneManager {

	public List<Personne> findAll();

	public Personne findById(int id);
	
	public Personne create(Personne personne);


}
