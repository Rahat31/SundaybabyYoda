package com.upskill.assignment1;

public class Assignment_1_1 {

	/*Problem 01: 1.	A triangle three arms are: 5, 7 and 11 inches. 
	Write a method to display the perimeter of triangle in console output. */


		public static void main(String[] args) {
			traiglePerimeter();
	
		}
		

		public static void traiglePerimeter(){
			
			int a =5;
			int b =7;
			int c =11;
			
			int perimeter = a + b + c;
			
			
			
			System.out.println("the perimeter of Triagle with arms 5 , 7, 11" + perimeter);
			
			
		}
}
