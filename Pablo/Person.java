package people;

import java.util.Date;

public class Person {
	/* Private Fields */
	private String pId;
	private String fName;
	private String lName;
	private Date birthDate;
	private Date startDate;
	
	/** Constructor */
	protected Person(String pId, String fName, String lName, Date birthDate, Date startDate) {
		
		this.pId = pId;
		this.fName = fName;
		this.lName = lName;
		this.birthDate = (Date) birthDate.clone();
		this.startDate = (Date) startDate.clone();
	}

	/**
	 * Getter for pId
	 * @return pId
	 */
	public String getpId() {
		return pId;
	}

	/**
	 * Getter for FName
	 * @return FName
	 */
	public String getFName() {
		return fName;
	}

	/**
	 * Getter for LName
	 * @return LName
	 */
	public String getLName() {
		return lName;
	}

	/**
	 * Getter for birthDate
	 * @return birthDate
	 */
	public Date getBirthDate() {
		
		return birthDate;
	}

	/**
	 * Getter for startDate
	 * @return startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	
	
	
	/**
	 * This is a simple method that prints all of the content
	 * for an object of type 'Person'.
	 */
	public void printInfo() {
		
		System.out.println("ID:\t" + this.getpId());
		System.out.println("F-Name:\t" + this.getFName());
		System.out.println("L-Name:\t" + this.getLName());
		System.out.println("BDate:\t" + this.getBirthDate().toInstant());
		System.out.println("SDate:\t" + this.getStartDate().toInstant());
	}


}
