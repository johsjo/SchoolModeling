package se.johsjo.schoolmedelning.models;

public class WrongSecialSecurityStructureException extends Exception {
	private static final long serialVersionUID = 8900068671881656552L;
	
	public WrongSecialSecurityStructureException(String massage) {
		super(massage); 
	}
	
	public WrongSecialSecurityStructureException(String massage, Throwable trowable) {
		super(massage, trowable);
	}
	
	@Override
	public String toString() {
		return super.getMessage();
	}
}
