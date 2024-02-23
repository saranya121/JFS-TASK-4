package task3;

import java.util.Scanner;

public class WeekDays {
	/**
	 * To get the weekdays for the day position
	 * 
	 * @param dayPostion
	 */
	private void getWeekDays(int dayPostion) {
		String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		try {
			System.out.println("Entered Day is: " + weekDays[dayPostion]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You have entered a wrong day position." + " Please enter a day position from 0 to 6");
		}
	}

	/**
	 * Main Method
	 * 
	 */
	public static void main(String a[]) {
		WeekDays weekDays = new WeekDays();
		System.out.println("Please enter a day position to display the weekdays:");
		Scanner sc = new Scanner(System.in);
		int dayPostion = sc.nextInt();
		/*
		 * To print the day otherwise throw exception
		 */
		weekDays.getWeekDays(dayPostion);
		sc.close();

	}
}
