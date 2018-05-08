package course;
import java.time.Year;
import java.util.UUID;

import comparators.CourseComparator;
import people.Instructor;
public class Course {
	/* Private Fields */
	private String courseId;
	private String courseTitle;
	private Course prerequisite;
	private Instructor instructor;
	private Year offeredYear;
	
	
	/** Constructor */
	public Course(String title, Instructor instructor, Year offeredYear) {
		this.generateID();
		this.courseTitle = title;
		this.prerequisite = null;
		this.instructor = instructor;
		this.offeredYear = offeredYear;
	}
	
	/** Constructor */
	public Course(String title, Course prerequisite, Instructor instructor, Year offeredYear) {
		this.generateID();
		this.courseTitle = title;
		this.prerequisite = prerequisite;
		this.instructor = instructor;
		this.offeredYear = offeredYear;
	}
	
	/**
	 * This method is to generate a random id to each course 
	 * as soon as they are constructed.
	 */
	private void generateID() {
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString().replaceAll("-", "").substring(0, 10);
		this.courseId = id;
	}
	
	/**
	 * Getter for 'courseId'
	 * @return courseId
	 */
	public String getCourseId() {
		return this.courseId;
	}
	public Instructor toString1() {
		return this.getInstructor();
	}
	
	/**
	 * Getter for 'courseTitle'
	 * @return courseTitle
	 */
	public String getCourseTitle() {
		return this.courseTitle;
	}
	
	/**
	 * Getter for 'prerequisite'
	 * @return prerequisite
	 */
	public Course getPrerequisite() {
		return this.prerequisite;
	}
	
	/**
	 * Getter for 'instructor'
	 * @return
	 */
	public Instructor getInstructor() {
		return this.instructor;
	}
	
	/**
	 * Getter for 'offeredYear'
	 * @return offeredYear
	 */
	public Year getOfferedYear(){
		return this.offeredYear;
	}
	@Override
	public String toString() {
		return this.courseTitle;
	}
	@Override
	public boolean equals(Object c) {
		
		CourseComparator comp = new CourseComparator();
			if(comp.compare((Course)c, this) == 0) {
				return true;
			}
			else {
				return false;
			}
	}
	
	/**
	 * This is a simple method that prints all of the content
	 * for an object of type 'Course'.
	 */
	public void printInfo(){
		System.out.println("-------------COURSE-------------");
		System.out.println("ID:\t\t" + this.getCourseId());
		System.out.println("Title:\t\t" + this.getCourseTitle());
		System.out.println("Offered in:\t" + this.getOfferedYear());
		System.out.println("Instructor:\t" + this.getInstructor());
		System.out.println("Prerequisite:\t" + this.getPrerequisite());
		System.out.println("--------------------------------");
	}

}
