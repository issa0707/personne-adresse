package com.issa.demoSpringBoot.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.issa.demoSpringBoot.beans.Personne;
import com.issa.demoSpringBoot.dao.PersonneDao;

@Service
public class PersonneManagerImpl implements PersonneManager {

	@Autowired
	private PersonneDao personneDao;

	@Override
	public List<Personne> findAll() {
		return (List<Personne>) personneDao.findAll();
	}

	@Override
	public Personne create(Personne personne) {		
		return personneDao.save(personne);
	}

	@Override
	public Personne findById(int id) {
		return personneDao.findById(id);
	}
	

}
