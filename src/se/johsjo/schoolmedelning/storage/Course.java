package se.johsjo.schoolmedelning.storage;

import java.util.Arrays;

import se.johsjo.schoolmedelning.models.*;

public class Course {
	private int courseId;
	public String courseDescription; // mandatory TODO Fetal initialize
	public Classroom classRoom; // mandatory TODO Fetal initialize
	private Teacher teacher;
	private Student[] studentInClass = new Student[1];
	private Lecture[] lecturesList = new Lecture[1];

	public Course(Teacher teacher) {
		this.teacher = teacher;
	}

	public void addLecture(Lecture lecture) {
		int i = lecturesList.length;
		lecturesList[i - 1] = lecture;
		lecturesList = Arrays.copyOf(lecturesList, lecturesList.length + 1);
	}

	public void addStudent(String firstName, String lastName, String socialSecurityNo) {

		try {
			Student student = new Student(firstName, lastName, socialSecurityNo);
			int i = studentInClass.length;
			studentInClass[i - 1] = student;
			studentInClass = Arrays.copyOf(studentInClass, studentInClass.length + 1);
			if (classRoom.getNumberOfSeats() < studentInClass.length - 1) {
				throw new CourseException();
			}

		} catch (WrongSecialSecurityStructureException e) {
			System.out.println(e);
		} catch (CourseException e) {
			studentInClass[studentInClass.length - 2].sitting = false;
		}

	}

	@Override
	public String toString() {
		StringBuilder outPut = new StringBuilder();

		outPut.append("Denna kurs hålls av läraren: " + teacher.getFirstName() + " " + teacher.getLastName());
		outPut.append("\nKursbeskrivning: " + courseDescription);
		outPut.append("\nFöljande föreläsningar kommer att hållas:");

		// lectures
		for (Lecture l : lecturesList) {
			if (l == null) {
				break;
			}
			outPut.append("\n" + l.getTopic() + "\t" + l.getLectureLength() + " minuter");
		}

		outPut.append("\nNärvarande elever:");

		// Students
		for (Student s : studentInClass) {
			if (s == null) {
				break;
			}
			outPut.append("\n" + s.getFirstName() + " " + s.getLastName() + " Sittplats: " + s.sitting);
		}

		return outPut.toString();
	}
}
