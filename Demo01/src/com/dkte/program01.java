package com.dkte;
import java.util.*;
class InvalidException extends RuntimeException{
	public  InvalidException() {
	 
	}
	public InvalidException(String s) {
		super(s);
		
	}
}
class Date{
	   int day;
      int month;
	
	public void setDay(int day) {
		if(day<=0||day>31) {
			throw new InvalidException("day should be in beteen 0 and 31");
		}
		this.day = day;
	}
	public void setMonth(int month) {
		if(month<=0||month>12) {
			throw new InvalidException("Month should be between 1 and 12");
		
		}
		this.month = month;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + "]";
	}
	
	
	
}
public class program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the day");
		 int day=sc.nextInt();
		 System.out.println("Enter the month");
		 int month=sc.nextInt();
		Date d1=new Date();
 		try {
			d1.setDay(day);
			d1.setMonth(month);
			System.out.println(d1);
 	  }
 	  catch (Exception e) {
 		 
 		// TODO: handle exception
 			System.out.println("You have entered wrong values :");
 		 System.out.println(e.getMessage());
 		}

	}

}
