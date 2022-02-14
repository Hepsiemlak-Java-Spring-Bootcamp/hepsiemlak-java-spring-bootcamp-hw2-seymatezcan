package com.company;

public class WorkplaceAdvert implements Advert {
    Enrollee enrollee;
    String title;
    String content;
    String city;

    public WorkplaceAdvert() {
    }

    public WorkplaceAdvert(Enrollee enrollee, String title, String content, String city) {
        this.enrollee = enrollee;
        this.title = title;
        this.content = content;
        this.city = city;
    }

    public Enrollee getEnrollee() {
        return enrollee;
    }

    public void setEnrollee(Enrollee enrollee) {
        this.enrollee = enrollee;
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

    @Override
    public void createAdvert() {
        WorkplaceAdvert workplaceAdvert=new WorkplaceAdvert();
    }
}
