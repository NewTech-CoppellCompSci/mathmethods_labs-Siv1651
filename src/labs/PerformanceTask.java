package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
		//declare variables
		//int time
		//dounle xPos
		//double yPos
		
		//Scan in velocity and angle as doubles
		
		//Print title
		//print time 0
		
		//loop until y < 0
		
			//calculate next second
			//print that second
		
		//xPosition = cosine of launch angle * time * launchVelocity;
		//yPosition = sine of launch angle * time * lanuchVelocity – 0.5 * 9.8 * time2
		//Math.sin(Math.toRadians(60))
		
		/*
		 * Get starting launch angle and velocity from the user
			While the t-shirt hasn't hit the ground
			Print current stats (time, location, etc.)
			Increment time
			Calculate new X and Y positions
			//t-shirts don't generally burrow into the ground, they should stop at 0
			Pseudo-Code
		 */
		
		int time = 0;
		double xPos = 0;
		double yPos = 0;
		boolean launched = false;
		System.out.println("Enter launch velocity (m/s) >>> ");
		Scanner inKey = new Scanner(System.in);
		double launchVelocity = inKey.nextDouble();
		System.out.println("Enter launch angle (degrees) >>> ");
		double launchAngle = inKey.nextDouble();
		System.out.print("Shirt's Path: ");
		xPos = xPos*Math.cos(Math.toRadians(launchAngle))*time*launchVelocity;
		yPos = yPos*Math.sin(Math.toRadians(launchAngle))*time*launchVelocity-0.5*9.8*time;
		launched = true;
		System.out.println("Time: " + time);
		System.out.println("xPos: " + xPos + "m");
		System.out.println("yPos: " + yPos + "m");
		while (launched) {
			time++;
			xPos = xPos*Math.cos(Math.toRadians(launchAngle))*time*launchVelocity;
			yPos = yPos*Math.sin(Math.toRadians(launchAngle))*time*launchVelocity-0.5*9.8*time;
			if (yPos < 0) {
				yPos = 0;
			}
			if (yPos == 0) {
				launched = false;
			}
			System.out.println("Time: " + time);
			System.out.println("xPos: " + xPos + "m");
			System.out.println("yPos: " + yPos + "m");
		}
	}
	
	
}
