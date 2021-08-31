package com.dpk.basics;

import java.util.Scanner;

public class SwapWithThirdVariable {
public static void main(String[] args) {
	double a, b, c;
	System.out.println("The value of a is ");
	Scanner sc1=new Scanner(System.in);
	a=sc1.nextDouble();
	System.out.println("The value of b is ");
	Scanner sc2=new Scanner(System.in);
	b=sc2.nextDouble();
	
	
	System.out.println("the value of a is "+a);
	System.out.println("the value of b is "+b);
	
	c=a;
	a=b;
	b=c;
	System.out.println("Now the value of a is "+a);
	System.out.println("Now the value of b is "+b);
}
}
