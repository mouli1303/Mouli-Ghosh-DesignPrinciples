package calculator;

import java.util.Scanner;

public class calci {

	public static void main(String[] args) {
		int c=0,temp=1;
		double x,y;
		Scanner sc=new Scanner(System.in);
		while(temp>0) {
		System.out.println("Enter 2 numbers=");
		x=sc.nextDouble();
		y=sc.nextDouble();
		System.out.println("Press 1 for sum, Press 2 for subtraction, press 3 for multiplication, Press 4 for division");
		c=sc.nextInt();
		double r=calculate(x,y,c);
		if(r==0)
		{
			System.out.println("Enter a valid input. Press 1 for sum, Press 2 for subtraction, press 3 for multiplication, Press 4 for division ");
		}
		else
		{
			System.out.println("your result="+r);
		}
		System.out.println("if you want to continue press 1. if you want to close calculator press 0");
		temp=sc.nextInt();
		}
		System.out.println("Calculator is closed");

	}
	static double calculate(double x,double y,int c)
	{
		if(c<1 || c>4)
		{
			return 0;
		}
		else
		{
			double[] result= {(x+y),(x-y),(x*y),(x/y)};
			return result[c-1];
		}
	}

}
