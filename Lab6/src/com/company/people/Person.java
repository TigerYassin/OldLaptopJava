package com.company.people;

import java.util.Date;

public abstract class Person {

    private String pId;
    private String fName;
    private String lName;
    private Date birthdate;
    private Date startDate;



    public String getpId() {
        return pId;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public Date getStartDate() {
        return startDate;
    }


    public void printInfo() {
        System.out.println("ID: " + pId);
        System.out.println("First Name: " + fName);
        System.out.println("Last Name: " + lName);
        System.out.println("Birthdate: " + birthdate);
        System.out.println("StartDate: " + startDate);
    }



    public Person(String pId, String fName, String lName, Date birthdate, Date startDate){
        this.pId = pId;
        this.fName = fName;
        this.lName = lName;
        this.birthdate = birthdate;
        this.startDate = startDate;
    }









}
