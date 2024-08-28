package com.vrx.SOLID.singleResponsibility.model;

import org.springframework.stereotype.Component;

public class Policy {
    private String policyNumber;
    private String description;

    public Policy(String policyNumber, String description) {
        this.policyNumber = policyNumber;
        this.description = description;
    }

    public Policy() {
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
