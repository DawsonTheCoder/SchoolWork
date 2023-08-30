package homework;
	/**
	* Class: CSCI1301-01 Introduction to Programming Principles
	* Instructor: Md Shakil Hossain
	* Description: (Have users input a value for feet and then convert said value into meters.)
	* Due: 8/25/2023 
	* I pledge by honor that I have completed the programming assignment independently.
	I have not copied the code from a student or any source.
	I have not given my code to any student.  
	Sign here: Dawson White
	*/

import java.util.Scanner;

public class Lab1{
	public static void main(String[] args) {
		//Main Method
		Scanner input = new Scanner(System.in);
		double foot;
		double meter;
		
		// Prompt the user to enter the value for foot variable
		System.out.print("Please enter the value of feet: ");
		foot = input.nextDouble();
		
		// Convert feet to meters
		meter = 0.305*foot;
		// Display results
		System.out.println(foot + " ft converted to meters is " + meter + " m");
		
	}
}
