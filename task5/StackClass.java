package task5;

import java.util.Scanner;
import java.util.Stack;

public class StackClass {
	Stack<Integer> stackObj = new Stack<>();

	/**
	 * Method to push elements
	 */
	private void pushElements() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be pushed");
		stackObj.push(sc.nextInt());
		System.out.println("Pushed Element is:" + stackObj);
	}

	/**
	 * Method to pop element
	 * 
	 */
	private void popElement() {
		if (!checkEmpty()) {
			stackObj.pop();
			System.out.println("Stack Element After Pop:" + stackObj);
		} else {
			System.out.println("Stack is empty");
		}
	}

	/**
	 * Method to check empty stack
	 */
	private boolean checkEmpty() {
		return stackObj.empty();

	}

	/**
	 * Main Method
	 * 
	 * @param a
	 */
	public static void main(String a[]) {
		StackClass stackClass = new StackClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("----------STACK--------");
		while (true) {
			System.out.println("1.Push Elements");
			System.out.println("2.Pop Elements");
			System.out.println("3.Check Empty");
			System.out.println("4.Exit");
			System.out.println("-----------------------------");
			System.out.println("Please enter the options:");
			int i = sc.nextInt();
			switch (i) {
			case 1:
				stackClass.pushElements();
				break;
			case 2:
				stackClass.popElement();
				break;
			case 3:
				System.out.println("Stack Empty Status:" + stackClass.checkEmpty());
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Invalid option");

			}
		}
	}

}
