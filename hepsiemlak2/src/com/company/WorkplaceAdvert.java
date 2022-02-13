package com.company;

public class WorkplaceAdvert implements Advert {

    String title;
    String content;
    Long price;
    Enrollee enrollee;

    public WorkplaceAdvert(String title, String content, Long price) {
        this.title = title;
        this.content = content;
        this.price = price;
    }

    public WorkplaceAdvert(String title, String content, Long price, Enrollee enrollee) {
        this.title = title;
        this.content = content;
        this.price = price;
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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Enrollee getEnrollee() {
        return enrollee;
    }

    public void setEnrollee(Enrollee enrollee) {
        this.enrollee = enrollee;
    }

    @Override
    public void showMessage() {
        System.out.println("Workplace advert created.");
    }
}
