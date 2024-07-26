package com.practice.apps;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		System.out.println("Enter Two numbers you want to swap:");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		System.out.println("You have entered : 1st no. ="+a+" and 2nd No."+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swaping we have : 1st no. ="+a+" and 2nd No."+b);
	}

}
