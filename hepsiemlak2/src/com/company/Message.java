package com.company;

import com.company.Enrollee;

public class Message {

    private Enrollee enrollee;
    private String content;
    private String title;
    private Enrollee sendTo;

    public Message(Enrollee enrollee, String content, String title, Enrollee sendTo) {
        this.enrollee = enrollee;
        this.content = content;
        this.title = title;
        this.sendTo = sendTo;
    }

    public Enrollee getEnrollee() {
        return enrollee;
    }

    public void setEnrollee(Enrollee enrollee) {
        this.enrollee = enrollee;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Enrollee getSendTo() {
        return sendTo;
    }

    public void setSendTo(Enrollee sendTo) {
        this.sendTo = sendTo;
    }
}
