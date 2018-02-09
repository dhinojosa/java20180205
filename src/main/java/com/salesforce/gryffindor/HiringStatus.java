package com.salesforce.gryffindor;

public enum HiringStatus {
    COMPLETED(5), IN_PROCESS(2), FAILED(1);

    private final int priority;

    HiringStatus(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
