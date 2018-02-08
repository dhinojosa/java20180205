package com.salesforce.gryffindor;

 abstract public class Mammal implements Ageable {
    private int temperatureFactor = 10; //member variable
    abstract public int currentBodyTemperature();
    abstract public int normalBodyTemperature();
    public boolean isIll() {
        return currentBodyTemperature() > normalBodyTemperature() + temperatureFactor;
    }
}
