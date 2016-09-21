package se.johsjo.schoolmedelning.models;

public class Teacher {
	
	private String firstName, lastName;
	private int teacherId;
	
	public Teacher(String firstName, String lastName, int techderId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.teacherId = techderId;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getTeacherId() {
		return teacherId;
	}
	
}

