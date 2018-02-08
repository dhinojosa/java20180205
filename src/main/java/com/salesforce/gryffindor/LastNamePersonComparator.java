package com.salesforce.gryffindor;

import java.util.Comparator;

public class LastNamePersonComparator implements Comparator<Person>{

	/*
	 * Negative left Person is less than the right
	 * 0 means are equals
	 * Positive left Person is greater than the right
	 * 
	 * (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Person o1, Person o2) {
		return o1.getLastName().compareTo(o2.getLastName());
	}



}
