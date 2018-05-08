package com.company.comparators;

import com.company.courses.Course;

public class CourseComparator implements Comparable<Course>{

    public int compare(Course c1, Course c2){

        return c1.getCourseTitle().compareToIgnoreCase(c2.getCourseTitle());

    }


    @Override
    public int compareTo(Course o) {
        return 0;
    }
}
