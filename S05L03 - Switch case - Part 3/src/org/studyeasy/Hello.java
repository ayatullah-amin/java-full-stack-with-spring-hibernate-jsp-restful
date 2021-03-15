package org.studyeasy;

public class Hello {

	public static void main(String[] args) {
		String name = "author";
		
		switch (name.toLowerCase()) {
		case "arul":
			System.out.println("It's Arul");
			break;
		case "author":
			System.out.println("It's Author");
			break;
		default:
			System.out.println("None of them");
		}
	}

}
