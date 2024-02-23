package task1;

import java.util.Scanner;

public class Main {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		boolean returnStatus = false;
		try {
			Student student = new Student();
			StudentManagementSystem sms = new StudentManagementSystem();

			// Get the student details from the user
			System.out.println("**********Please fill the Student Details Form**********");
			System.out.println("Roll No.:");
			student.setRollNo(sc.next());
			System.out.println("Student Name:");
			student.setName(sc.next());
			System.out.println("Age:");
			student.setAge(sc.nextInt());
			System.out.println("Course:");
			student.setCourse(sc.next());

			/*
			 * To check whether the age is lies between 15 & 21. If not, throws an user
			 * defined exception. Else Success Message is displayed
			 */
			returnStatus = sms.checkAgeLimit(student.getAge());

			/*
			 * To check whether the name does not contains any special characters. If not,
			 * throws an user defined exception. Else Success Message is displayed
			 */
			returnStatus = sms.checkStudentName(student.getName());

			if (returnStatus) {
				System.out.println("You have successfully updated the student details.");
			}
		} catch (AgeNotWithinRangeException e) {
			System.out.println(e.getMessage());
		} catch (NameNotValidException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
