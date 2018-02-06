package com.salesforce.gryffindor;

public class Person {
   //Not really a good idea	
   public String firstName;
   public String lastName;

   @Override
   public String toString() {
      return "Person (" + firstName + "," + lastName + ")";
   }

   @Override
   public boolean equals(Object obj) {
      if (!(obj instanceof Person)) {
         return false;
      } else {
         Person other = (Person) obj;
         return this.firstName.equals(other.firstName) &&
        		    this.lastName.equals(other.lastName);
      }
   }
}
