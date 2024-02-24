package task2;

import java.util.Scanner;

public class Main {
	public static void main(String a[]) throws InvalidAgeException {
		try {
			Scanner sc = new Scanner(System.in);
			Voter voter = new Voter();
			// Get the Voter details from the user
			System.out.println("**********Please fill the Voter Details Form**********");
			System.out.println("Voter Id.:");
			voter.setVoterId(sc.next());
			System.out.println("Name:");
			voter.setName(sc.next());
			System.out.println("Age:");
			voter.setAge(sc.nextInt());
			//Setting the voter details in constructor
			voter = new Voter(voter.getVoterId(), voter.getName(), voter.getAge());
			sc.close();
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
