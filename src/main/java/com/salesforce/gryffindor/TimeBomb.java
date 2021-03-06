package com.salesforce.gryffindor;

import java.io.IOException;

public class TimeBomb {

    public void throwARuntimeException() {
        throw new RuntimeException("Oh oh!");
    }

    public int throwAArithmeticException() {
        return 1/0;
    }

    public void throwACheckedException()
            throws Exception {
        throw new Exception("You better handle this...");
    }

    public void throwACheckedException(int num)
            throws Exception {
        if (num == 0) throw new Exception("Regular Exception");
        else throw new IOException("IOException");
    }

    public void throwAIOException()
            throws IOException {
        throw new IOException(
                "You better handle this cause IO be freaky!...");
    }
    
    public void throwAThrowable() throws Throwable {
       throw new Throwable("Something bad happened");	    
    }
    
}
