package com.salesforce.gryffindor;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;

import static java.time.temporal.ChronoUnit.YEARS;

public class Person implements Ageable{

    static {
        System.out.println("Loading Person Class");
    }

    private final String firstName;
    private final String lastName;


    //As of 9.0: Optional is not serializable
    //Use vavr.io (formerly javaslang) library is you
    // really want to have an
    // Optional type
    //  as a member variable.

    private final String middleName;
    private LocalDate birthDate;
    private static int count;

    public Person(String firstName, String lastName) {
		this(firstName, null, lastName);
	}

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthDate = null;
        count += 1;
        System.out.println("Created another Person");
    }

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this(firstName, lastName);
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person (" + firstName + "," + lastName + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return Objects.equals(this.firstName, other.firstName) &&
        		   Objects.equals(this.lastName, other.lastName);
    }
    
    @Override
    public int hashCode() {
    	  return Objects.hash(firstName, lastName);
    }

    public String getLastName() {
		return this.lastName;
	}

	public Optional<String> getMiddleName() {
        return Optional.ofNullable(this.middleName);
    }
	//Immutable
    public Person setLastName(String lastName) {
        return new Person(this.firstName, lastName);
    }

    @Override
    public int getAge() {
        //import static java.time.temporal.ChronoUnit.YEARS;
        return (int) YEARS.between(birthDate,LocalDate.now());
    }

    public static String foo() {
        return "Foo";
    }

    public static int count() {
        return count;
    }

    static {
        System.out.println("Just about done loading Person Class");
    }
}
