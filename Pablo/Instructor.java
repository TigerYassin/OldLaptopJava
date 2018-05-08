package people;

import java.text.DecimalFormat;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import course.Course;

public class Instructor extends Person {
	// fields
	float teachingRate;
	private List<Course> taughtCourses;

	public Instructor(String pId, String fName, String lName, Date birthDate, Date startDate, float teachingRate, List<Course> taughtCourses) {
		super(pId, fName, lName, birthDate, startDate);
		
		this.teachingRate = 0;
		this.taughtCourses = new LinkedList<Course>();

		DecimalFormat numberFormat = new DecimalFormat("#.00");
		Random number = new Random();
		float A = 2 + number.nextInt(3) + number.nextFloat();
		A = Float.parseFloat(numberFormat.format(A));

	}

	public float getTeachingRate() {
		return teachingRate;

	}

	public List<Course> getTaughtCourses() {
		return taughtCourses;

	}
	public String toString() {
		return this.getFName();
	}

	public void addCourse(Course b) {
		if (this.taughtCourses.contains(b)) {
			System.out.println("Course Already Exists:\t");

		}
		else {
			this.taughtCourses.add(b);
			System.out.println("Successfully Added");
		}

	}

	public void dropCourse(Course removed) {
		if (this.taughtCourses.contains(removed)) {
			this.taughtCourses.remove(removed);
			System.out.println("Dropped Course:\t" + removed);
		} else {
			System.out.println("Blopper:");
		}
	}

	public void rateMyProfessor() {
		float sum = 0;
		Random rn = new Random();
		for (int i = 0; i < taughtCourses.size(); i++) {
			sum += rn.nextInt((4 - 1) + 1) + 1;
		}
		this.teachingRate = sum / taughtCourses.size();
	}

	@Override
	public void printInfo() {
		System.out.println("-------------Instructor------------");
		super.printInfo();
		System.out.println("Teaching Rate:\t" + this.getTeachingRate());
		System.out.println("Courses:\t" + Arrays.toString(taughtCourses.toArray()));
		System.out.println("--------------------------------");
	}

}
