package com.vrx.SOLID.singleResponsibility.model;

import org.springframework.stereotype.Component;

import java.util.UUID;

public class PolicyManager {
    public Policy createPolicy(Policy policy) {
        System.out.println("Policy is created..");
        policy = new Policy();
        policy.setPolicyNumber(UUID.randomUUID().toString());
        policy.setDescription("Life Policy");
        return policy;
    }
}
