package com.hdfc.loan.homeloan;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args)
	{
		
		int nr,dr,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numerator value");
		nr=sc.nextInt();
		System.out.println("enter denominator value");
		dr=sc.nextInt();
		
		try
		{
		res=nr/dr;
		System.out.println("division value is:"+res);

	    }
		
	catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
     
}
}

