package com.company;

import java.util.ArrayList;
import java.util.List;

public class HousingAdvertFactory implements AdvertFactory {

    PersonalEnrolleeFactory personalEnrolleeFactory;
    PersonalEnrollee personalEnrollee;

    List<HousingAdvert>housingAdvertList=new ArrayList<>();

    @Override
    public void create() {
        HousingAdvert housingAdvert=new HousingAdvert("yeni bir ilan","sıfır bina, sıfır daire,sahibinden satılık",35000000L, new PersonalEnrollee("seyma@hotmail.com"));
        housingAdvertList.add(housingAdvert);
        System.out.println(housingAdvert.price);
        System.out.println(housingAdvert.getEnrollee().getEmail());
        housingAdvert.showMessage();


    }
}
