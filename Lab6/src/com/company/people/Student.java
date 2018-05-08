package com.company.people;

import com.company.courses.Course;

import java.util.*;

public class Student extends Person{

    List takenCouses;
    float gpa;



    public List getTakenCouses() {
        return takenCouses;
    }

    public float getGpa() {
        return gpa;
    }


    public void addCourse(Course myCourse) {
        if (!this.takenCouses.contains(myCourse)) {
            takenCouses.add(myCourse);
        }else {
            System.out.println("Error: This course already exists in the list!");
        }
    }

    public void dropCourse(Course drop) {
        if (this.takenCouses.contains(drop)) {
            this.takenCouses.remove(drop);
            System.out.println("Dropped Course:\t" + drop);
        } else {
            System.out.println("Blopper:");
        }
    }

    public void evalutate() {
        float sum = 0;
        Random rn = new Random();
        for (int i = 0; i < takenCouses.size(); i++) {
            sum+= rn.nextInt((4-1) + 1) + 1;
        }
        this.gpa = sum / takenCouses.size();

    }


    public void printInfo() {
        System.out.println("ID: " + getpId());
        System.out.println("First Name: " + getfName());
        System.out.println("Last Name: " + getlName());
        System.out.println("Birthdate: " + getBirthdate());
        System.out.println("StartDate: " + getStartDate());
        System.out.println("Taken Courses: " + takenCouses);
        System.out.println("GPA: " + gpa);
    }



    public Student(String pId, String fName, String lName, Date birthdate, Date startDate) {
        super(pId, fName, lName, birthdate, startDate);
        takenCouses = new LinkedList();
        gpa = 0;

    }


}
