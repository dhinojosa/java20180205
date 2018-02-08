package com.salesforce.gryffindor;

import java.time.LocalDate;

public class American extends Person {
    private String ssn;
	
	public American(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public American(String firstName, String middleName, String lastName) {
        super(firstName, middleName, lastName);
    }

    public American(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }
  
    public American(String firstName, String middleName, 
    		            String lastName, String ssn) {
    	    super(firstName, middleName, lastName);
        this.ssn = ssn;
    }
    
    
 
}
