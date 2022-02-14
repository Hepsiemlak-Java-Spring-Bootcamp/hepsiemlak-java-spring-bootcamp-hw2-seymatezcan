package com.company;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkplaceAdvert implements Advert{

    public String title;
    public Date date;
    public Time time;
    public String content;
    public String sehir;
    public Enrollee enrollee;
    public  Long fiyat;
    private String type;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public Enrollee getEnrollee() {
        return enrollee;
    }

    public void setEnrollee(Enrollee enrollee) {
        this.enrollee = enrollee;
    }

    public Long getFiyat() {
        return fiyat;
    }

    public void setFiyat(Long fiyat) {
        this.fiyat = fiyat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WorkplaceAdvert() {
    }

    public WorkplaceAdvert(String title, String content, String sehir, Enrollee enrollee, Long fiyat) {
        this.title = title;
        this.content = content;
        this.sehir = sehir;
        this.enrollee = enrollee;
        this.fiyat = fiyat;
    }

    @Override
    public void create() {
        System.out.println("Workplace advert created. ");
    }
}
