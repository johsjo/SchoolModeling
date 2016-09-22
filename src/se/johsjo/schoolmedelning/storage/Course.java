package se.johsjo.schoolmedelning.storage;

import java.util.Arrays;

import se.johsjo.schoolmedelning.models.*;

public final class Course {
	private int courseId;
	private String courseDescription;
	private Classroom classRoom;
	private Teacher teacher;
	private Student[] studentInClass = new Student[0];
	private Lecture[] lecturesList = new Lecture[0];

	public Course(Teacher teacher, String courseDescription, Classroom classRoom) {
		this.teacher = teacher;
		this.courseDescription = courseDescription;
		this.classRoom = classRoom;
	}

	public void addLecture(Lecture lecture) {
		int i = lecturesList.length;
		lecturesList = Arrays.copyOf(lecturesList, i + 1);
		lecturesList[i] = lecture;
	}

	public Course addStudent(String firstName, String lastName, String socialSecurityNo) {
		int i = 0;
		
		try {
			Student student = new Student(firstName, lastName, socialSecurityNo);
			studentInClass = Arrays.copyOf(studentInClass, studentInClass.length + 1);
			i = studentInClass.length;
			studentInClass[i - 1] = student;
			if (classRoom.getNumberOfSeats() < i) {
				throw new CourseException("Klassrummet är fullt");
			}

		} catch (WrongSecialSecurityStructureException e) {
			System.err.println(e);
		} catch (CourseException e) {
			studentInClass[i - 1].setSitting(false);
		}
		return this;
	}

	@Override
	public String toString() {
		StringBuilder outPut = new StringBuilder();

		outPut.append("Denna kurs hålls av läraren: " + teacher.getFirstName() + " " + teacher.getLastName());
		outPut.append("\nKursID: " + courseId);
		outPut.append("\nKursbeskrivning: " + courseDescription);
		outPut.append("\nFöljande föreläsningar kommer att hållas:");

		// Lectures
		for (Lecture l : lecturesList) {
			outPut.append("\n" + l.getTopic() + "\t" + l.getLectureLength() + " minuter");
		}

		outPut.append("\nNärvarande elever:");

		// Students
		for (Student s : studentInClass) {
			outPut.append("\n" + s.getFirstName() + " " + s.getLastName() + " Sittplats: " + s.getSitting());
		}

		return outPut.toString();
	}
	
}
