package com.vrx.SOLID.singleResponsibility.model;

import org.springframework.stereotype.Component;


public class PolicyPrinter {
    public void printPolicyDetails(Policy policy){
        System.out.println("Policy details are:"+policy);
    }
}
