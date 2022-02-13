package com.company;

public class HousingAdvert implements Advert {

    String title;
    String content;
    Long price;
    PersonalEnrollee enrollee;
    CorparateEnrollee enrollee1;

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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public PersonalEnrollee getEnrollee() {
        return enrollee;
    }

    public void setEnrollee(PersonalEnrollee enrollee) {
        this.enrollee = enrollee;
    }

    public HousingAdvert(String title, String content, Long price, PersonalEnrollee enrollee) {
        this.title = title;
        this.content = content;
        this.price = price;
        this.enrollee = enrollee;
    }

    public HousingAdvert(String title, String content, Long price) {
        this.title = title;
        this.content = content;
        this.price = price;
    }

    @Override
    public void showMessage() {
        System.out.println("Housing advert created.");
    }
}
