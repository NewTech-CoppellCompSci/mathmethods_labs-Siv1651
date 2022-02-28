package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		System.out.println("Enter a positive integer: ");
		Scanner inKey = new Scanner(System.in); 
		int inIntOne = inKey.nextInt();
		System.out.println("Enter another positive integer: ");
		int inIntTwo = inKey.nextInt();
		
		int max = Math.max(inIntOne, inIntTwo);
		int min = Math.min(inIntOne, inIntTwo); 
		for (int i = 1; i <= 10;) {
			int randNum = (int)(Math.random() * max + min);
			System.out.print(randNum + " ");
			i++;
		}
		System.out.println();
		
	}
	
	
	
	
	public static void problem02() {
		System.out.println("Enter a radius: ");
		Scanner inKey = new Scanner(System.in); 
		double radius = inKey.nextDouble();
		System.out.println("Enter a height: ");
		double height = inKey.nextDouble();
		double volume = Math.PI*(Math.pow(radius, 2))*height;
		System.out.print("The volume of this cylinder is: " + volume);
		//v = pi*r^2*h
	}

	
	

	public static void problem03() {
		//sqrt of sum of squared values of x axis distance and y axis distance
		//sqrt((pow(x2-x1))+(pow(y2-y1)))
		
		System.out.println("Enter x1: ");
		Scanner inKey = new Scanner(System.in); 
		double x1 = inKey.nextDouble();
		System.out.println("Enter y1: ");
		double y1 = inKey.nextDouble();
		System.out.println("Enter x2: ");
		double x2 = inKey.nextDouble();
		System.out.println("Enter y2: ");
		double y2 = inKey.nextDouble();
		double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		System.out.print(distance);
	}


	
	
	public static void problem04() {
		//Declare both steps
		double xStepOne = 0;
		double xStepTwo = 0;
		//Get values
		Scanner inKey = new Scanner(System.in); 
		System.out.println("Enter a-value: ");
		int a = inKey.nextInt();
		System.out.println("Enter b-value: ");
		int b = inKey.nextInt();
		System.out.println("Enter c-value: ");
		int c = inKey.nextInt();
		//Calculate equation
		double getNegativeB = (b * -1);
		xStepOne = getNegativeB + Math.sqrt(Math.pow(b, 2) - 4*a*c);
		xStepTwo = xStepOne/(2*a);
		System.out.println("x1 = " + xStepTwo);
		xStepOne = getNegativeB - Math.sqrt(Math.pow(b, 2) - 4*a*c);
		xStepTwo = xStepOne/(2*a);
		System.out.println("x2 = " + xStepTwo);
		
	}
	
	

	
}
