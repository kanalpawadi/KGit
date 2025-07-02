package com.dkte;
import java.util.*;
class InvalidTimeException extends Exception{
	public  InvalidTimeException() {
	 
	 
	}
	public InvalidTimeException(String s) {
		super(s);
		
	}
}
class Time{
	private int hr ;
    private int min;
	
	 public void setHr(int hr)throws  InvalidTimeException {
		 if(hr<=0||hr>23)
			 throw new InvalidTimeException("the hour shoulld in between 0 and 23");
		this.hr = hr;
	}
	 public void setMin(int min)throws InvalidTimeException {
		 if(min <=0 || min >60)
			 throw new InvalidTimeException("The min shoud in between 1 and 60 ");
		this.min = min;
	}
	 @Override
	 public String toString() {
		return "Time [hr=" + hr + ", min=" + min + "]";
	 }
	 
	
}
public class Program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the hr");
		 int hr=sc.nextInt();
		 System.out.println("Enter the min");
		 int min=sc.nextInt();
		Time d1=new Time();
		try {
			d1.setHr(hr);
			d1.setMin(min);
			 
			System.out.println(d1);
		}
		catch (InvalidTimeException e) {
			// TODO: handle exception
			System.out.println("Exception Message: " + e.getMessage()); 
		    e.printStackTrace();  
		    System.out.println("You have entered wrong values :");
		}

	}

}
