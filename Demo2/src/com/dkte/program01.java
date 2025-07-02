package com.dkte;
 

import java.util.Scanner;

enum ArithmeticOperation {
	EXIT, ADDITION, SUBSTRACTION, MULTIPLICATION, DIVISION, SQUARE, SQUAREROOT
}

public class program01 {

	 public static ArithmeticOperation menu(Scanner sc) {
		 ArithmeticOperation arr[]=ArithmeticOperation.values();
		 for(ArithmeticOperation e: arr) {
			 System.out.println(e.ordinal()+"."+e.name());}
			 System.out.println("Enter the choice :->");
			 return arr[sc.nextInt()];
		 
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArithmeticOperation choice ;
		try { 
      do {
    	  choice= menu(sc);
         
     
		switch(choice) {
		case EXIT:
			System.out.println("Exiting code --------->>>>>>>>>>>>>.");
			break;
		case ADDITION:
			Addition a1= new Addition();
			a1.accept(sc);
			a1.display();
			break;
		case SUBSTRACTION:
			Subtract a2= new Subtract();
			a2.accept(sc);
			a2.display();
			break;
			
		case  MULTIPLICATION:
			Multiplication m1=new Multiplication();
			m1.accept(sc);
			m1.display();
			break;
		case DIVISION:
			Division d1=new Division();
			d1.accept(sc);
			d1.display();
		    break;
		case SQUARE:
			break;
		case SQUAREROOT:
			break;
			
		default:
			break;
		}
      }while(choice !=ArithmeticOperation.EXIT);
	
	  
	}catch (Exception e) {
		System.out.println("please Enter the valid choice ");
	}
		
}
}
