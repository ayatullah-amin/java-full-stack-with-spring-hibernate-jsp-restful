package org.studyeasy;

public class Hello {

	public static void main(String[] args) {
		for(int i=1, j=1; i<10 || j<10; i++, j++) {
			j++;
			System.out.println("i: " + i + " and j: " + j);
		}
		
		int a=1,b=1;
		while(a<10 && b<10) {
			a++;
			b++;
			System.out.println("a: " + a + " and b: " + b);
		}
		
		int i=1,j=1;
		do {
			System.out.println("i: " + i + " and j: " + j);
			i++;
			j++;
		} while(i<10 && j <10);
	}

}
