package com.vrx.SOLID.singleResponsibility.model;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

public class PolicyRepository {

    public void savePolicyToDB(Policy policy){
        System.out.println("Policy is saved in DB");
    }
}
