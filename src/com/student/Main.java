package com.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CrudeOperations crudeOperations = new CrudeOperations();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add Student \n2. Show Student \n3. Remove Student \n4. Update student");
			System.out.print("Choise Options:-> ");
			int choice = input.nextInt();
			System.out.println();
			
			switch (choice) {
			case 1:
				crudeOperations.addStudent();
				break;
				
			case 2:
				crudeOperations.showStudent();
				break;
				
			case 3:
				crudeOperations.removeStudent();
				break;
				
			case 4:
				crudeOperations.updateStudent();
				break;

			default:
				System.out.println("Please choose correct choice.");
				break;
			}
		}
	}
}
