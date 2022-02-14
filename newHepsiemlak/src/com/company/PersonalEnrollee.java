package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonalEnrollee implements Enrollee{

    List<Advert> adverts=new ArrayList<>();

    private String email;
    private Set<Advert> favoriteAdverts=new HashSet<>();

    public List<Advert> getAdverts() {
        return adverts;
    }

    public void setAdverts(List<Advert> adverts) {
        this.adverts = adverts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Advert> getFavoriteAdverts() {
        return favoriteAdverts;
    }

    public void setFavoriteAdverts(Set<Advert> favoriteAdverts) {
        this.favoriteAdverts = favoriteAdverts;
    }

    @Override
    public void createEnrolle() {
        System.out.println("Personal enrollee created.");
    }
}
