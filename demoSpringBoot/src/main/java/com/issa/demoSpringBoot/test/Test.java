package com.issa.demoSpringBoot.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.issa.demoSpringBoot.beans.Personne;
import com.issa.demoSpringBoot.manager.PersonneManager;

public class Test {

	public static void main(String[] args) {
		
		Personne personne1 = new Personne();
		personne1.setNom("ba");
		personne1.setPrenom("thiane");
	//	personneManager.save(personne1);

	}
	@Autowired
	private PersonneManager personneManager;

}
