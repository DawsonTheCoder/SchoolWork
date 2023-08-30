package homework;
/**
* Class: CSCI1301-C Introduction to Programming Principles 
* Instructor: Dawson White
* Description: (Compute the base area and volume of a cylinder given the radius and length of said cylinder via user input.) 
* Due: Due Date 08/27/2023
* I pledge by honor that I have completed the programming assignment independently. 
I have not copied the code from a student or any source. 
I have not given my code to any student. 
Sign here: Jimmy D. White
*/

import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) {
		//Main Method
		Scanner input = new Scanner(System.in);
		
		//Initializing variables
		final double pi = 3.14159;
		int radius;
		double length;
		double area;
		double volume;
		
		//Asking for user input
		System.out.print("Please input a value for radius: ");
		radius = input.nextInt();
		System.out.print("Please input a value for length: ");
		length = input.nextDouble();
		
		//Computations
		area = radius*radius*pi;
		volume = area*length;
		
		//Output
		System.out.println("The area of the cylinder is " + area + " units squared.");
		System.out.println("The volume of the cylinder is " + volume + " units cubed.");
	}

}
