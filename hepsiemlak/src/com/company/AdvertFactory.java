package com.company;

public class AdvertFactory {

    public Advert getAdvert (String advertType){
        if(advertType==null){
            return null;
        }
        if(advertType.equalsIgnoreCase("HOUSING")){
            return (Advert) new HousingAdvert();
        }
        else if(advertType.equalsIgnoreCase("WORKPLACE")){
            return (Advert) new WorkplaceAdvert();
        }
        return null;
    }


}
