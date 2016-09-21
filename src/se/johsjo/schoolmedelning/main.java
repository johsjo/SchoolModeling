package se.johsjo.schoolmedelning;

import se.johsjo.schoolmedelning.models.*;
import se.johsjo.schoolmedelning.storage.*;

public class main {

	public static void main(String[] args) {

		Course course = new Course(new Teacher("Kajsa", "Anka", 1001));

		course.courseDescription = "Denna kurs är riktigt bra!";

		course.addLecture(new Lecture(111, 90, "Grymt Bra Föreläsning!!!"));
		course.addLecture(new Lecture(112, 35, "Grymt Mycket Bättre Föreläsning!!!"));

		course.classRoom = new Classroom(101, 5);

		course.addStudent("Kalle", "Anka", "8311112222");
		course.addStudent("Kalle", "Anka", "8311112222");
		course.addStudent("Kalle", "Anka", "8311112222");
		course.addStudent("Kalle", "Anka", "8311112222");
		course.addStudent("Kalle", "Anka", "8311112222");
		course.addStudent("Kalle", "Anka", "8311112222");
		course.addStudent("Kalle", "Anka", "8311112222");
		course.addStudent("Kalle", "Anka", "8311112222");
		course.addStudent("Kalle", "Anka", "8311112222");

		System.out.println(course.toString());

		System.out.println("End");

	}

}
