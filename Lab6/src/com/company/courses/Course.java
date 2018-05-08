package com.company.courses;

import com.company.comparators.CourseComparator;
import com.company.people.Instructor;

import java.time.Year;
import java.util.Date;
import java.util.UUID;

public class Course {

    private String courseId;
    private String courseTitle;
    private Course prerequisite;
    private Instructor instructor;
    private Year offeredYear;

    public String getCourseId() {
        return courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public Course getPrerequisite() {
        return prerequisite;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Year getOfferedYear() {
        return offeredYear;
    }


    public String generateID(){
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString().replaceAll("-", "").substring(0,10);
        return id;
    }

    @Override
    public String toString() {
        return courseTitle;
    }


    public boolean equals(Object c){
        CourseComparator comp = new CourseComparator();
        if (comp.compare((Course)c, this) == 0){
            return true;
        }
        else {
            return false;
        }
    }


    public Course(String courseTitle, Instructor instructor, Year offeredYear) {

        this.courseTitle = courseTitle;
        this.instructor = instructor;
        this.offeredYear = offeredYear;

    }

    public Course(String courseTitle, Instructor instructor, Year offeredYear, Course prerequisite) {
        this.courseTitle = courseTitle;
        this.instructor = instructor;
        this.offeredYear = offeredYear;
        this.prerequisite = prerequisite;
    }
}
