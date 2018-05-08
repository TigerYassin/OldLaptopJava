
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import comparators.CourseComparator;
import comparators.InstructorCmparator;
import comparators.StudentComparator;
import course.Course;
import people.Instructor;
import people.Person;
import people.Student;

/**
 * 
 * Friday 23-Feb-2018
 * 
 * This project contains both what we practiced and what
 * is to be completed as your homework.
 * 
 * 
 * @author Azim Ahmadzadeh - https://grid.cs.gsu.edu/~aahmadzadeh1/
 *
 */

/**
 * This project is implemented to let the students to practice more on the
 * topics of inheritance, encapsulation, and polymorphism. In addition, it
 * concentrates on overriding 'toString', and 'compare'.
 */
public class Main {

	public static void main(String[] args) {
		// DATE Information
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
		Date tempBDate = new GregorianCalendar(1990, Calendar.FEBRUARY, 11).getTime();
		Date tempSDate = new GregorianCalendar(2014, Calendar.MARCH, 11).getTime();
		Date tempXDate = new GregorianCalendar(1975, Calendar.FEBRUARY, 11).getTime();
		Date tempYDate = new GregorianCalendar(2018, Calendar.MARCH, 11).getTime();

		/////////////////////////////// Course
		/////////////////////////////// Information////////////////////////////////////////////////
		Course c1 = new Course("Algebra", null, null, Year.parse("2016"));

		;

		Course c2 = new Course("Biology", null, null, Year.parse("2016"));
		c2.printInfo(); // THIS is printing out course information
		Course c3 = new Course("Calculus", null, Year.parse("2016"));
		Course c4 = new Course("Chemistry", null, Year.parse("2016"));

		List<Course> myCourse = new LinkedList<Course>();
		myCourse.add(c1);
		myCourse.add(c2);
		myCourse.add(c3);
		myCourse.add(c4);
		System.out.println(Arrays.toString(myCourse.toArray()));

		/////////////////////////////////// First Student//////////////////////////////////////////////////
		Person s1 = new Student("111", "Pablo", "Trevizo", tempBDate, tempSDate);
		// Type CAST
		((Student) s1).addCourse(c1);
		((Student) s1).addCourse(c2);
		((Student) s1).addCourse(c3);
		((Student) s1).addCourse(c4);
		((Student) s1).printInfo();
		((Student) s1).evalutate();
		((Student) s1).dropCourse(c2);
		((Student) s1).printInfo();

		Person s2 = new Student("121", "Alex", "Trevizo", tempBDate, tempSDate);
		Course cs21 = new Course("Algebra", null, null, Year.parse("2016"));
		Course cs22 = new Course("Biology", null, null, Year.parse("2016"));
		Course cs23 = new Course("Chemistry", null, null, Year.parse("2016"));
		Course cs24 = new Course("Calculus", null, null, Year.parse("2016"));

		((Student) s2).addCourse(cs21);
		((Student) s2).addCourse(cs22);
		((Student) s2).addCourse(cs23);
		((Student) s2).addCourse(cs24);
		((Student) s2).printInfo();
		((Student) s2).evalutate();
		((Student) s2).dropCourse(c2);
		((Student) s2).printInfo();

		System.out.println("Course Equivalent:\t" + c3.equals(c4));

		//////////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////// InstructorMaterial///////////////////////////////////////////
		Instructor in1 = new Instructor("CSC", "Azim", "dawit", tempXDate, tempYDate, 0, null);
		Instructor in2 = new Instructor("CSC", "Tony", "dawit", tempXDate, tempYDate, 0, null);

		((Instructor) in1).addCourse(c1);
		((Instructor) in1).addCourse(c2);
		((Instructor) in1).addCourse(c3);
		((Instructor) in1).addCourse(c4);

		((Instructor) in2).addCourse(c1);
		((Instructor) in2).addCourse(c2);
		((Instructor) in2).addCourse(c3);
		((Instructor) in2).addCourse(c4);

		((Instructor) in2).dropCourse(c1);
		((Instructor) in2).rateMyProfessor();
		((Instructor) in2).printInfo();

		System.out.println("Instructor Equals:\t" + c3.equals(c2));
		//////////////////////////////////////////////////////////////////////////////////////////////////
		StudentComparator stud = new StudentComparator();
		System.out.println("Let us Judge Student by their GPA:" + stud.compare((Student) s1, (Student) s1));

		CourseComparator Cou = new CourseComparator();
		System.out.println("Course Comparator:\t:" + Cou.compare((Course) c1, (Course) c2));

		InstructorCmparator comp = new InstructorCmparator();
		System.out.println("Course Comparator:\t:" + comp.compare(in1, in2));

		/*
		 * Test 1: (-toString-) 1. Create an instance of 'Course', and call it 'c1'. 2.
		 * Is the output of this line meaningful: > System.out.println(c1.toString());
		 */

		/*
		 * Test 2: (-equals-) 1. Create two instances of 'Course', c1 and c2 (with
		 * different titles) 2. Can you compare them? Try this: >
		 * System.out.println(c1.equals(c2)); (Hint: true, for similar titles, and
		 * false, otherwise.
		 */

		/*
		 * Test 3: (-improved addCourse-) 1. Create an instance of 'Student'
		 * (Polymorphic: reference to 'Person') 2. Create 3 different courses. 3. Add
		 * those courses to the student's list of 'takenCourses'. 4. Try to add a 4th
		 * course, which has the same title as one of the previous ones. (Hint: The
		 * course should not be added.)
		 */

		/*
		 * Test 4: (-improved dropCourse-) 1. Try to drop one of the three courses that
		 * you previously added. 2. Try to drop a course that is not in the list. (Hint:
		 * you should not get any errors.)
		 */

		/*
		 * Test 5: (-Student:evaluate-) 1. Create a student, s1, with several courses.
		 * 2. Create another student, s2, with several courses. 3. Evaluate each of
		 * them. (i.e., run s1.evaluate()) 4. Call printInfo for each of them. (Do they
		 * have 'gpa'?) (Hint: GPAs other than zero should be displayed.)
		 */
		/*
		 * Test 6: (-Student:Comparator-) 2. Compare s1 and s2: > StudentComparator comp
		 * = new StudentComparator(); > System.out.println(comp.compare(s1, s2); (Hint:
		 * The difference between the students' gpa should be printed.)
		 */

		/*
		 * Test 7: (-Instructor:addCourse-) 1. Create an instance of 'Instructor'
		 * (Polymorphic: reference to 'Person') 2. Create 3 different courses. 3. Add
		 * those courses to the instructor's list. 4. Try to add a course that already
		 * exists in the list. (Hint: The course should not be added.)
		 */

		/*
		 * Test 8: (-Instructor:dropCourse-) 1. Try to drop one of the instructor's
		 * courses. 2. Try to drop a course which is not in the list. (Hint: you should
		 * not get any errors.)
		 */

		/*
		 * Test 9: (-Instructor:evaluate-) 1. Create an instructor, in1, with 3
		 * different courses. 2. Create another constructor, in2, with 3 different
		 * courses. 3. Evaluate each instructors. (i.e., run 'evaluate' method.) 4. Call
		 * 'printInfo' for each of them. (Hint: teachingRates other than zero should be
		 * displayed!)
		 */
		/*
		 * Test 10: (-Instructor:comparator-) 2. For in1 and in2, run: >
		 * InstructorComparator comp = new InstructorComparator(); >
		 * System.out.println(comp.compare(in1, in2); (Hint: The difference between the
		 * instructors' rate should be printed.)
		 */

	}

}
