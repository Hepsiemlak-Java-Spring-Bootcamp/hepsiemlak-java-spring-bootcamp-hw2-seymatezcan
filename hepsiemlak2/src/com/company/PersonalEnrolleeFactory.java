package com.company;

import java.util.HashSet;
import java.util.Set;

public class PersonalEnrolleeFactory implements EnrolleeFactory {

    Set<Enrollee> enrolleeSet=new HashSet<>();

    @Override
    public void create() {

       Enrollee enrollee=new PersonalEnrollee("seymatezcan@hotmail.com");
       enrolleeSet.add(enrollee);
        System.out.println("Enrollee created.");
    }

    @Override
    public void getEnrollee() {

    }
}
