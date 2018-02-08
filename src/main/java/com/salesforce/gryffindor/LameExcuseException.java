package com.salesforce.gryffindor;

public class LameExcuseException extends RuntimeException {

    public LameExcuseException() {
    }

    public LameExcuseException(String message) {
        super(message);
    }

    public LameExcuseException(String message, Throwable cause) {
        super(message, cause);
    }

    public LameExcuseException(Throwable cause) {
        super(cause);
    }


}
