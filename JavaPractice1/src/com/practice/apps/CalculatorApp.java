package com.practice.apps;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Object s;
		int yn = 0;
		do {
		System.out.println("Welcome to Calculator: ");
		System.out.println("Enter your option:");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextShort();
		System.out.println("You have entered : "+choice);
		switch(choice)
		{ case 1: System.out.println("1. Addition");
		addTwoNumbers();
			break;
		case 2: System.out.println("2. Substraction");
		subsTwoNumbers();
		break;
		case 3: System.out.println("3. Multiplication");
		multTwoNumbers();
		break;
		case 4: System.out.println("4. Division");
		divTwoNumbers();
		break;
		default: System.out.println("PLz try again, option entered was wrong");
		
		}
		System.out.println("Do you want to continue:press 1 for yes and 0 for No");
		@SuppressWarnings("resource")
		Scanner Yn= new Scanner(System.in);
		yn= Yn.nextInt();
		}while(1==yn);
	}
	static void addTwoNumbers()
	{
		System.out.println("Please enter two numbers to add:");
		Scanner n= new Scanner(System.in);
		int a=n.nextInt();
		int b=n.nextInt();
		System.out.println("Sum is :"+(a+b));
	}
	static void subsTwoNumbers()
	{
		System.out.println("Please enter two numbers to Substract:");
		Scanner n= new Scanner(System.in);
		int a=n.nextInt();
		int b=n.nextInt();
		System.out.println("Substraction Result is:"+(a-b));
	}
	static void multTwoNumbers()
	{
		System.out.println("Please enter two numbers to Multiply:");
		Scanner n= new Scanner(System.in);
		int a=n.nextInt();
		int b=n.nextInt();
		System.out.println("Multiplicatio Result is :"+(a*b));
	}
	static void divTwoNumbers()
	{
		System.out.println("Please enter two numbers to Divide:");
		Scanner n= new Scanner(System.in);
		int a=n.nextInt();
		int b=n.nextInt();
		if(b==0)
			System.err.println("Dinominator cant be zero");
		else 
		{	float p=a,q=b;
			System.out.println("Divisio Result in is :"+(p/q));
		}
	}
	
//	TODO: 
	// to do a normal simplification
	// 2+6/5-23*6

}
