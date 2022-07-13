package com.student;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CrudeOperations {
	ArrayList<Student> studentList = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	
	//for add student
	public void addStudent() {
		Student student = new Student();
		System.out.print("Enter First Name Of Student:-> ");
		student.firstName = input.next();
		
		System.out.print("Enter Last Name Of Student:-> ");
		student.lastName = input.next();
		
		System.out.print("Enter student Roll No:-> ");
		student.rollNo = input.nextInt();
		
		System.out.print("Enter department of Student:-> ");
		student.department = input.next().charAt(0);
		
		System.out.print("College Name Of Student:-> ");
		student.collegeName = input.next();
		
		studentList.add(student);
		System.out.println("Student Add successfully.");
		System.out.println();
	}
	
	//for shows student
	public void showStudent() {
		System.out.println("Student Details is:-> ");
		if(studentList.isEmpty()) {
			System.out.println("Student List is Empty.");
		}else {
			for (Student student : studentList) {
				System.out.println(student);
				}
		}
		System.out.println();
	}
	
	//for remove student
	public void removeStudent() {
		System.out.println("Enter Name Who u want to Remove:-> ");
		String name = input.next();
		for (Student student : studentList) {
			if(student.firstName.equals(name)) {
				studentList.remove(student);
				System.out.println("Removed Successfully.");
			}else {
				System.out.println("Entered Name is Not in Student List.");
			}
		}
		System.out.println();
	}
	
	//for update student
	public void updateStudent() {
		System.out.print("Enter student name who u want to Update:-> ");
		String name = input.next();
		for (Student student : studentList) {
			if(student.firstName.equals(name)) {
				System.out.println("1. First Name \2. Last Name \3. Roll No \4. Department \5. College Name");
				System.out.print("Choose which field U want to Update:-> ");
				int choice = input.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Enter First Name:-> ");
					student.firstName = input.next();
					break;
					
				case 2:
					System.out.print("Enter Last Name:-> ");
					student.lastName = input.next();
					break;
					
				case 3:
					System.out.print("Enter student Roll No:-> ");
					student.rollNo = input.nextInt();
					break;
					
				case 4:
					System.out.print("Enter Department Name:-> ");
					student.department = input.next().charAt(0);
					break;
					
				case 5:
					System.out.print("Enter College Name:-> ");
					student.collegeName = input.next();
					break;

				default:
					System.out.println("Choose correct Choice.");
					break;
				}
				System.out.println("Updated Successfully.");
			}else {
				System.out.println("Entered Name is Not in Student List.");
			}
			System.out.println();
		}
	}
}
