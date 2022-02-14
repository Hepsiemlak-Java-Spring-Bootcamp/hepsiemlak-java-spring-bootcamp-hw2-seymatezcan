package com.company;

public class HousingAdvert implements Advert {

    Enrollee enrollee;
    String type;
    String title;
    String content;
    String city;

    public Enrollee getEnrollee() {
        return enrollee;
    }

    public void setEnrollee(Enrollee enrollee) {
        this.enrollee = enrollee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public HousingAdvert() {
    }

    public HousingAdvert(Enrollee enrollee, String type, String title, String content, String city) {
        this.enrollee = enrollee;
        this.type = type;
        this.title = title;
        this.content = content;
        this.city = city;
    }

    @Override
    public void createAdvert() {
        HousingAdvert housingAdvert=new HousingAdvert();
    }
}
