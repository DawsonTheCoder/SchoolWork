package homework;
/**
* Class: CSCI1301-C Introduction to Programming Principles 
* Instructor: Md Shakil Hossain 
* Description: (Take user Input for 2 variables called num1 and num2 then sort the two variables and print the sorted numbers) 
* Due: Due Date(for example 09/01/2023)
* I pledge by honor that I have completed the programming assignment independently. 
I have not copied the code from a student or any source. 
I have not given my code to any student. 
Sign here: Jimmy D. White 
*/
import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		//Scanner Object created
		Scanner myInput = new Scanner(System.in);
		
		//User input for num1 and num2 variables
		System.out.print("Enter the value of num1: ");
		int num1 = myInput.nextInt();
		System.out.print("Enter the value of num2: ");
		int num2 = myInput.nextInt();
		
		//Declaration of temp variable for swapping
		int temp;
		
		//If statement for sorting num1 and num2 from user input
		if(num1 >= num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
			//Output if num1 > num2
			System.out.println("The sorted numbers are " + num1 + ", " + num2);
		}
		//For any other contingency swapping is unnecessary so simple output
		else {
			System.out.println("The sorted numbers are " + num1 + ", " + num2);
		}
	}
}
