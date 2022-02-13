package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonalEnrollee implements Enrollee {

    private String email;
    private List<Message> messageList=new ArrayList<>();
    private Set<Advert> favoriteAdverts=new HashSet<>();

    public String getEmail() {
        return email;
    }

    public PersonalEnrollee(String email) {
        this.email = email;
    }

    @Override
    public void showMessage() {
        System.out.println("Personal enrollee created.");

    }

    @Override
    public Enrollee getEnrollee(Enrollee enrollee) {
        return enrollee;
    }
}
