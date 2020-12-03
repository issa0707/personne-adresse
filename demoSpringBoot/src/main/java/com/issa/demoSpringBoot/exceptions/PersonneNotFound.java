package com.issa.demoSpringBoot.exceptions;

public class PersonneNotFound extends Exception {
	
	public PersonneNotFound() {
		super();
	}
	
	public PersonneNotFound(String message) {
		super(message);
	}

}
