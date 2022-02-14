package com.company;

import java.util.ArrayList;
import java.util.List;

public class EnrolleeFactory {

    public boolean getPersonalEnrolleesList(String email) {
        return personalEnrolleesList.contains(email);
    }

    public void setPersonalEnrolleesList(List<Enrollee> personalEnrolleesList) {
        this.personalEnrolleesList = personalEnrolleesList;
    }

    public List<Enrollee> getCorparateEnrolleeList() {
        return corparateEnrolleeList;
    }

    public void setCorparateEnrolleeList(List<Enrollee> corparateEnrolleeList) {
        this.corparateEnrolleeList = corparateEnrolleeList;
    }

    List<Enrollee>personalEnrolleesList=new ArrayList<>();
    List<Enrollee>corparateEnrolleeList=new ArrayList<>();

    public Enrollee getEnrollee(String enrolleeType){
        if(enrolleeType==null){
            System.out.println("Not created.");
        }
        if(enrolleeType.equalsIgnoreCase("personal")){
            PersonalEnrollee personalEnrollee=new PersonalEnrollee();
            personalEnrollee.setEmail("seyma@hotmail.com");
            personalEnrolleesList.add(personalEnrollee);

        }
        else if(enrolleeType.equalsIgnoreCase("corparate")){
           CorparateEnrollee corparateEnrollee=new CorparateEnrollee();
           corparateEnrollee.setEmail("abcCompany@hotmail.com");
           corparateEnrolleeList.add(corparateEnrollee);
        }
        return null;
    }
}
