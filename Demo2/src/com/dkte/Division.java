package com.dkte;
import java.util.*;
public class Division {
	int num1;
	int num2;
	
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("enter the num1 and num2");
		num1=sc.nextInt();
		System.out.println("Enter the second number");
		 num2=sc.nextInt();
		

	}
	public  void display() {
		// TODO Auto-generated method stub
		try {
			float result=num1/num2;
			  System.out.println("result "+result);

			}
		catch (Exception e) {
			 System.out.println("denominator mus be grater than zero :");		}
		}
   
}


