package com.upskill.assignment1;

public class assignment_2_2 {

	/*A rectangle width and length are: 9 and 13 inches.
	   Write a method to display the perimeter of rectangle in console output.*/

	
	public static void main(String[] args) {
		rectanglePerimeter();
	}
		
		public static void rectanglePerimeter(){
			
			int  a=9;
			int  b=13;
			
			int rectangle = 2*(a+b);
			
			
			System.out.println("the perimeter of rectangle with arms 9,13 is" + rectangle);
			
			
			
		
	}

}
