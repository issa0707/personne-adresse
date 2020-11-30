package com.issa.demoSpringBoot.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.issa.demoSpringBoot.beans.Personne;
import com.issa.demoSpringBoot.manager.PersonneManager;

@RestController
public class PersonneContoller {

	@Autowired
	private PersonneManager personneManager;

	@RequestMapping(method = RequestMethod.GET, path = "/personne")
	public List<Personne> afficherPersonnes() {

		return personneManager.findAll();
	}

}

//@RestController
//public class PersonneContoller {
//
//    @Autowired
//    private PersonneManager personneManager;
//
//    @GetMapping(value="/personne/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public Personne afficherPersonne(@PathVariable int id) {
//        Personne personne = personneManager.findById(id);
//
//        if (personne == null){
//            throw new PersonneNotFound("Aucune personne trouvé pour l'id = "+id);
//        }
//        return personne;
//    }
//}