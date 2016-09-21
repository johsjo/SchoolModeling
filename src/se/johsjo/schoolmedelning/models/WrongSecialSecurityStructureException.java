package se.johsjo.schoolmedelning.models;

public class WrongSecialSecurityStructureException extends Exception {

	@Override
	public String toString() {
		return "\nThe format is wrong, the Secial Security nummver have to be 10 or 12 characters long";
	}
}
