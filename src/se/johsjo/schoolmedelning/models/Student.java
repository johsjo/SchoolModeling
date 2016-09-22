package se.johsjo.schoolmedelning.models;

public class Student {

	private String firstName, lastName, socialSecurityNo;
	private boolean sitting;

	public Student(String firstName, String lastName, String socialSecurityNo)
			throws WrongSecialSecurityStructureException {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sitting = true;

		try {
			if (socialSecurityNo.length() == 10 || socialSecurityNo.length() == 12) {
				this.socialSecurityNo = socialSecurityNo;
			} else {
				throw new WrongSecialSecurityStructureException("Personnumret är i fel format: " + socialSecurityNo);
			}
		} catch (WrongSecialSecurityStructureException exc) {
			throw exc;
		}
	}

	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getSocialSecurityNo() { return socialSecurityNo; }
	public boolean getSitting(){ return sitting; }
	public void setSitting(boolean sitting) { this.sitting = sitting; }
	
}
