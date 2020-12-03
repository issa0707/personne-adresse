package com.issa.demoSpringBoot.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.issa.demoSpringBoot.beans.Personne;
import com.issa.demoSpringBoot.exceptions.PersonneNotFound;
import com.issa.demoSpringBoot.manager.PersonneManager;

@RestController
public class PersonneContoller {

	@Autowired
	private PersonneManager personneManager;

	@RequestMapping(method = RequestMethod.GET, path = "/personne")
	public List<Personne> afficherPersonnes() {

		return personneManager.findAll();
	}

	@RequestMapping(value="/personne/{id}")
	public Personne lister(@PathVariable int id) {
	
//		if (personne == null) {
//			throw new PersonneNotFound("Aucune personne trouvée pour l'id = " + id);
//		}
		return personneManager.findById(id);
	}

	@RequestMapping(method=RequestMethod.POST, path ="/personne")	
	public Personne recupererPersonne(@RequestBody Personne personne) {
		return personneManager.create(personne);		
	}

}

