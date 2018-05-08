package comparators;

import java.util.Comparator;

import course.Course;

public class CourseComparator implements Comparator<Course> {
	/**
	 * This method compares courses by comparing their 'courseTitle'
	 * lexicographically.
	 */
	@Override
	public int compare(Course c1, Course c2) {
		
		
//		return c1.getCourseId().compareTo(c2.getCourseId());
		return c1.getCourseTitle().compareToIgnoreCase(c2.getCourseTitle());
	}


}
