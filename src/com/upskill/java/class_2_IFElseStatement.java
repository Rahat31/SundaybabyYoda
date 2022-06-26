package com.upskill.java;

public class class_2_IFElseStatement {

	public static void main(String[] args) {
		
		int day = 5;
		 
		switch (day){
		case 1:
			
			System.out.println("Monday");
			break;
			
            case 2:
			System.out.println("Tuesday");
			break;
			
            case 3:
			System.out.println("Wednesday");
			break;
			
            case 4:
			System.out.println("Thursday");
			break;
			
            case 5:
			System.out.println("Friday");
			break;
			
            case 6:
			System.out.println("Saturday");
			break;
			
		}
		
		// Nested if Else statement 
		 int year =2020 ;
		  
		 if ( year <2000){
			 System.out.println("20th century");
			 
		 } else {
			 if ( year >= 2019 && year <= 2022){
				 System.out.println("Pandemic");
				 
			 } else {
				 System.out.println("21st century");
			 }
		 }
	
		
		// TODO Auto-generated method stub

		// less then = 13 = children 
		//13-18=teenager 
		//18-60 = adult 
		//60-100 = senior 
		// + 100 = champion 
		
		
		
    int age =80;
    
     if (age <13){ 
    	 System.out.println("you are childre !!!");
    	 
     } else if ( age > 13 &&  age < 18 ){
    	 
    	 System.out.println("you are teenager !!!");
     } else if ( age > 18 && age < 60){
    	 
    	 System.out.println("you are adult !!!");
     }else if ( age > 60 &&  age < 100 ){
    	 System.out.println("you are senior !!!");
    	 
     }else {
    	 System.out.println("you are champion !!!");
		 
	}
	}
     
	
	
}
