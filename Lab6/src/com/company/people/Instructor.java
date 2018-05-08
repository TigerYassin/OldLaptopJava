package com.company.people;

import com.company.courses.Course;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Instructor extends Person{

    private float teachingRate;
    private List<Course> taughtCourses;

    public float getTeachingRate() {
        return teachingRate;
    }

    public List<Course> getTaughtCourses() {
        return taughtCourses;
    }


    public void printInfo() {
        System.out.println("Overrode the Person Class method from the Instructor class");
    }


    public void addCourse(Course b) {
        if (this.taughtCourses.contains(b)) {
            System.out.println("Error:\t");

        }
        else {
            this.taughtCourses.add(b);
            System.out.println("Clear");
        }

    }



    public void removeCourse(Course removed) {
        if (this.taughtCourses.contains(removed)) {
            this.taughtCourses.remove(removed);
            System.out.println("Dropped Course:\t" + removed);
        } else {
            System.out.println("Blopper:");
        }
    }



    public void evaluate() {
        float sum = 0;
        Random rn = new Random();
        for (int i = 0; i < taughtCourses.size(); i++) {
            sum += rn.nextInt((4 - 1) + 1) + 1;
        }
        this.teachingRate = sum / taughtCourses.size();
    }



    public Instructor(String pId, String fName, String lName, Date birthdate, Date startDate, List<Course> taughtCourses, float teachingRate) {
        super(pId, fName, lName, birthdate, startDate);

        this.taughtCourses = taughtCourses;


        DecimalFormat numberFormat = new DecimalFormat("#.00");
        Random rn = new Random();
        float a = 2 + rn.nextInt(3) + rn.nextFloat();
        this.teachingRate = Float.parseFloat(numberFormat.format(a));

    }
}
