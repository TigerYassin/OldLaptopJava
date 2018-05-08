package com.company;

import com.company.courses.Course;
import com.company.people.Person;
import com.company.people.Student;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
        Date tempDate = new GregorianCalendar(1990, Calendar.FEBRUARY, 11).getTime();

        Course c1 = new Course("Algebra", null, Year.parse("2016"));

        Person myStudent = new Student(c1.generateID(), "Yassin", "Alsahlani", tempDate, new Date());

        Course c2 = new Course("Game Design", null, Year.parse("2016"));
        Course c3 = new Course("English 1102", null, Year.parse("2017"));
        Course c4 = new Course("DataStructers", null, Year.parse("2018"));

        List<Course> myCourses = new LinkedList<Course>();
        myCourses.add(c1);
        myCourses.add(c2);
        myCourses.add(c3);
        myCourses.add(c4);

        ((Student)myStudent).addCourse(c1);
        ((Student)myStudent).addCourse(c2);
        ((Student)myStudent).addCourse(c3);
        ((Student)myStudent).addCourse(c4);
        ((Student)myStudent).addCourse(c1);
        myStudent.printInfo();
        System.out.println(Arrays.toString(myCourses.toArray()));

        ((Student) myStudent).dropCourse(c3);

    }

}
