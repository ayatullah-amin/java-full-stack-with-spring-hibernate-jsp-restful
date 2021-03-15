package org.studyeasy;

public class Hello {

	public static void main(String[] args) {
		
		//3 parts: #1 initialization of variable, #2 condition, #3 increment/decrement
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
		//Reverse the loop
		for(int i = 99; i>=1; i--) {
			System.out.print("Value of i: ");
			System.out.println(i);
		}
		
		// all parts inside loop branches is optional
		int i = 100;
		for(; i>=1; i--) {
			System.out.println("Number is: " + i);
		}
		
		int j = 10;
		for(;;) {
			System.out.println("Value is: " + j);
			if(j<=1) {
				break;
			}
			j--;
		}
		
		//infinite loop
		for(;;) {
			System.out.println("Writing");
		}
	}

}
