package com.brixton.input.model;

public enum PetStatusType {
    AVAILABLE("AVAILABLE"),
    PENDING("PENDING"),
    SOLD("SOLD");

    private String status;

    PetStatusType(String status) {
        this.status = status;
    }

    String getStatus() {
        return this.status;
    }
}
