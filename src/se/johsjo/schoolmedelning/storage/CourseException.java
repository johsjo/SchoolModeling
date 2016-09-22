package se.johsjo.schoolmedelning.storage;

public class CourseException extends Exception{
	private static final long serialVersionUID = -299363672761889741L;
	
	public CourseException(String massage) {
		super(massage);
	}
	
	public CourseException(String massage, Throwable throwable) {
		super(massage, throwable);
	}
	
	@Override
	public String toString() {
		return super.getMessage();
	}
	
}
