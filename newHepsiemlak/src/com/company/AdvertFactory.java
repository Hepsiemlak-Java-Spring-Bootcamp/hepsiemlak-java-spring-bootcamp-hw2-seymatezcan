package com.company;

import java.util.ArrayList;
import java.util.List;

public class AdvertFactory {

    EnrolleeFactory enrolleeFactory=new EnrolleeFactory();

    List<Advert>housingAdverts=new ArrayList<>();
    List<Advert>workplaceAdverts=new ArrayList<>();

    public Advert getAdvert(String advertType){
        if(advertType==null){
            return null;
        }
        if(advertType.equalsIgnoreCase(("Housing"))){
            HosuingAdvert hosuingAdvert=new HosuingAdvert();
            hosuingAdvert.setTitle("new advert");
            hosuingAdvert.setEnrollee(enrolleeFactory.getEnrollee("seyma@hotmail.com"));
            housingAdverts.add(hosuingAdvert);

        }
        else if(advertType.equalsIgnoreCase("Workplace")){
            WorkplaceAdvert workplaceAdvert=new WorkplaceAdvert();
            workplaceAdvert.setContent("new advert");
            workplaceAdvert.setEnrollee(enrolleeFactory.getEnrollee("seyma@hotmail.com"));
            workplaceAdverts.add(workplaceAdvert);

        }
        return null;
    }
}
