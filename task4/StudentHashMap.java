package task4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentHashMap {
	private HashMap<String, Integer> hashMap = new HashMap<>();

	/**
	 * Method to create a new student
	 * 
	 * @return
	 */
	private void createStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name: ");
		String name = sc.next();
		System.out.println("Enter the grade: ");
		int grade = sc.nextInt();
		hashMap.put(name, grade);
		displayAllStudents();
	}

	/**
	 * Method to remove student by their student name
	 * 
	 * @param str
	 */
	private void removeStudent(String key) {
		if (hashMap.containsKey(key)) {
			hashMap.remove(key);
			System.out.println("Entered Student details is removed");
		} else
			System.out.println("Please enter a valid Student name");
	}

	/**
	 * Method to display student by their key
	 * 
	 * @param key
	 * @return
	 */
	Integer displayStudent(String key) {
		return hashMap.get(key);

	}

	/**
	 * Method to display all students with their grades
	 * 
	 * @param hashMap
	 */
	private void displayAllStudents() {
		Iterator<Entry<String, Integer>> i = hashMap.entrySet().iterator();
		System.out.println("::Student Details::");
		while (i.hasNext()) {
			Map.Entry<String, Integer> entry = i.next();
			System.out.println("Student Name: " + entry.getKey());
			System.out.println("Grade: " + entry.getValue());
		}
	}

	/**
	 * Main Method
	 * 
	 * @param a
	 */
	public static void main(String a[]) {
		StudentHashMap studentHashMap = new StudentHashMap();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("-----------------------------");
			System.out.println("1.Add Student");
			System.out.println("2.Remove a Student");
			System.out.println("3.Display a Student");
			System.out.println("4.List All Students");
			System.out.println("5.Exit");
			System.out.println("-----------------------------");
			System.out.println("Please enter the options:");
			int i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("Enter a student name & grade to add:");
				studentHashMap.createStudent();
				break;
			case 2:
				System.out.println("Enter a student name to remove:");
				sc = new Scanner(System.in);
				studentHashMap.removeStudent(sc.next());
				break;
			case 3:
				System.out.println("Enter a student name to display:");
				sc = new Scanner(System.in);
				System.out.println("Grade:" + studentHashMap.displayStudent(sc.next()));
				break;
			case 4:
				studentHashMap.displayAllStudents();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid option");

			}
		}
	}
}
