package se.johsjo.schoolmedelning.storage;

public final class Classroom {
	private int classroomNo, numberOfSeats;

	public Classroom(int classroomNr, int numberOfSeats) {
		this.classroomNo = classroomNr;
		this.numberOfSeats = numberOfSeats;
	}

	public int getClassroomNo() { return classroomNo; }
	public int getNumberOfSeats() { return numberOfSeats; }
}
