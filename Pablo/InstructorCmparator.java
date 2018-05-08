package comparators;

import java.util.Comparator;

import people.Instructor;

public class InstructorCmparator implements Comparator<Instructor> {
	@Override
	public int compare(Instructor in1, Instructor in2) {

		return (int) (in1.getTeachingRate() - in2.getTeachingRate());
	}

}
