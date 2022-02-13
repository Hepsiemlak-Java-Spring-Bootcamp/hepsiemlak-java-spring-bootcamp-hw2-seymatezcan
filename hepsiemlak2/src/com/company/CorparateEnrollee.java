package com.company;

import com.company.Enrollee;

public class CorparateEnrollee implements Enrollee {


    @Override
    public void showMessage() {
        System.out.println("Corparate enrollee created.");

    }

    @Override
    public Enrollee getEnrollee(Enrollee enrollee) {
        return null;
    }
}
