package org.studyeasy;

public class Hello {

	public static void main(String[] args) {
		int x = 5;
		int y = 4;
		
		/*
		 * if (x==1) { System.out.println("The value of x is 1"); } else if (x==2) {
		 * System.out.println("The value of x is 2"); } if (x==3) {
		 * System.out.println("The value of x is 3"); }
		 */
		
		switch(x) {
		case 1: System.out.println("The value of x is 1");
				break;
		case 2: System.out.println("The value of x is 2");
				break;
		case 3: 
			System.out.println("The value of x is 3");
			System.out.println("Line is more than 2");
			break;
		default: 
			System.out.println("The value of x is other than 1,2,3");
		}
		
		switch (y) {
		case 4:
			System.out.println("It's 4");
			break;

		default:
			System.out.println("Nothing");
			break;
		}
		
	}

}
