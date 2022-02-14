package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        AdvertFactory advertFactory=new AdvertFactory();
        Advert advert=advertFactory.getAdvert("Housing");
        advert.create();

        EnrolleeFactory enrolleeFactory=new EnrolleeFactory();
        Enrollee enrollee=enrolleeFactory.getEnrollee("Corparate");
        enrollee.createEnrolle();


    }
}
