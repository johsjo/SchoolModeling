package se.johsjo.schoolmedelning.models;

public class Student {

	private String firstName, lastName, socialSecurityNo;
	public boolean sitting = true; //TODO public fatel initialize

	public Student(String firstName, String lastName, String socialSecurityNo)
			throws WrongSecialSecurityStructureException {
		this.firstName = firstName;
		this.lastName = lastName;

		try {
			if (socialSecurityNo.length() == 10 || socialSecurityNo.length() == 12) {
				this.socialSecurityNo = socialSecurityNo;
			} else {
				throw new WrongSecialSecurityStructureException();
			}
		} catch (WrongSecialSecurityStructureException exc) {
			throw exc;
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNo() {
		return socialSecurityNo;
	}

}
