package org.studyeasy;

public class Hello {

	public static void main(String[] args) {
		char s = 'B';
		
		switch (s) {
		case 'a':
		case 'A':
			System.out.println("It's a");
			break;
		case 'b':
		case 'B':
			System.out.println("It's b");
			break;
		default:
			System.out.println("It's c");
			break;
		}
	}

}
