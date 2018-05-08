package comparators;

import java.util.Comparator;

import people.Student;

public class StudentComparator implements Comparator<Student> {

	/**
	 * This method compares students based on their name (lexicographically). It
	 * compares their family names first, if they have identical family names, then
	 * it compares their first names.
	 */
	@Override
	public int compare(Student s1, Student s2) {

		if (s1.getLName().equals(s2.getLName())) {
			return s1.getFName().compareToIgnoreCase(s2.getFName());
		} else {
			return s1.getLName().compareToIgnoreCase(s2.getLName());
		}

	}

}
