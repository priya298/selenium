package com.hdfc.loan.homeloan;

public class A 
{
	int a=10;
	
	public void m1(int i)
	{
		System.out.println("hi iam m1 method in class a:" +i);
	}
	
	public void m2(float f)
	{
		System.out.println("hi iam m2 method in class a:" +f);
	}
	
	public void m3(String s)
	{
		System.out.println("hi iam m3 method in class a:" +s);
	}
	public static void main(String[] args) 
	{
		A a=new A();
		a.m1(10);
		a.m2(20.03f);
		a.m3("vishnu");
	}

}