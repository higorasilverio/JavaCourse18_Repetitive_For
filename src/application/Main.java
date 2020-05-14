package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Enter the final number: ");
		int last = scanner.nextInt();
		for(int i = 1; i <=last; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		scanner.close();
		
	}

}
