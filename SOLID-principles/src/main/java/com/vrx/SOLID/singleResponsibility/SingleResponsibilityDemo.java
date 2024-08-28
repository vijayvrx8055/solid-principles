package com.vrx.SOLID.singleResponsibility;

import com.vrx.SOLID.singleResponsibility.model.Policy;
import com.vrx.SOLID.singleResponsibility.model.PolicyManager;
import com.vrx.SOLID.singleResponsibility.model.PolicyPrinter;
import com.vrx.SOLID.singleResponsibility.model.PolicyRepository;

public class SingleResponsibilityDemo {
//    Each class should have similar types of responsibility
    public static void main(String[] args) {
        Policy initPolicy = null;
        PolicyManager policyManager = new PolicyManager();
        Policy policy = policyManager.createPolicy(initPolicy);

        PolicyPrinter policyPrinter = new PolicyPrinter();
        policyPrinter.printPolicyDetails(policy);

        PolicyRepository repository = new PolicyRepository();
        repository.savePolicyToDB(policy);
//        Here for each kind of activity specific classes are created
    }
}
