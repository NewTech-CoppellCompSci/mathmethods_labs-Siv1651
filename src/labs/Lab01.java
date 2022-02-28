package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		System.out.println("Enter a positive integer:");
		Scanner inKey = new Scanner(System.in); 
		int inInt = inKey.nextInt();
		System.out.println("Enter another positive integer: ");
		int inPower = inKey.nextInt();
		double powerCalc= Math.pow(inInt, inPower);
		System.out.println(inInt + "^" + inPower + " = " + powerCalc);
	}
	
	
	
	
	public static void problem02() {
		System.out.println("Enter a positive integer:");
		Scanner inKey = new Scanner(System.in); 
		double inInt = inKey.nextInt();
		double rootOfInt = Math.sqrt(inInt);
		System.out.println("The square root of " + inInt + " is " + rootOfInt);
	}

	
	

	public static void problem03() {
		System.out.println("Length of side A: ");
		Scanner inKey = new Scanner(System.in); 
		double inSideA = inKey.nextInt();
		System.out.println("Length of side B: "); 
		double inSideB = inKey.nextInt();
		double finalResult = Math.sqrt(Math.pow(inSideB, 2.0) + Math.pow(inSideA, 2.0));
		System.out.println("Hypotenuse = " + finalResult);
	}


	
	
	public static void problem04() {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		Scanner inKey = new Scanner(System.in); 
		boolean zeroFound = false;
		while (!zeroFound) {
			System.out.println("Enter an integer: ");
			int x = inKey.nextInt();
			if (x == 0) {
				zeroFound = true;
				System.out.println("Max = " + max);
				System.out.println("Min = " + min);
			} else {
				max = Math.max(max, x);
				min = Math.min(min, x);
			}
			
		}
		
		
		
	}
	
	public static void notes() {
		
		/*
		 * Constants
		 * 
		 * Math.PI
		 * Math.E
		 */
		
		System.out.println(Math.PI);
		System.out.println(Math.E + "\n");
		
		
		/*
		 * Exponents
		 * Math.pow(base, exponent)
		 */
		
		double num1 = Math.pow(8, 5);
		System.out.println("8^5 = " + num1 + "\n");
		
		
		
		/*
		 * Max and Min
		 * See Notes09_Accumulation
		 * 
		 * 
		 * When find a max or a min, you want to start
		 * at the extremes
		 * 
		 * Integer.MAX_VALUE
		 * Integer.MIN_VALUE
		 * 
		 * Math.max(num, num)
		 * Math.min(num, num)
		 * 
		 */ 
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.println(max);
		System.out.println(min + "\n");
		//Now loop to find max and mins
		
		int x1 = 7, x2 = -3, x3 = 12, x4 = -5;
		
		System.out.println(max);  //1st
		
		max = Math.max(max, x1);
		System.out.println(max);  //2nd
		
		max = Math.max(max, x2);
		System.out.println(max);  //3rd
		
		max = Math.max(max, x3);
		System.out.println(max);  //4th
		
		max = Math.max(max, x4);
		System.out.println(max + "\n");  //5th
		//You'd never do it like that, it just acts like a loop
		
		
		
		/*
		 * Square Root
		 * 
		 * Math.sqrt(number)
		 */
		
		double num2 = Math.sqrt(26);
		System.out.println(num2 + "\n");
		
		
		/*
		 * Trig Functions
		 * sin cos tan
		 * 
		 * Math.sin(angle)
		 * Math.cos(angle)
		 * Math.tan(angle)
		 * 
		 * These are IN RADIANS!!!!!!!!
		 * 
		 * Math.toRadians(angle in degrees)
		 * Math.toDegrees(angle in radians)
		 * 
		 * 
		 */
		
		double rand = Math.random() * 10;
		
		
		
		
	}
	
	
	
	
}
