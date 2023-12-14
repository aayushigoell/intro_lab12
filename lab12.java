package lab12;

import java.util.Scanner;

public class lab12 {

	public static double Calculate_circle1(double radius) {
		double area;
		area = Math.PI*radius*radius;
		return area;
	}
	public static double Calculate_circle2(double radius) {
		double circumference;
		circumference = 2*Math.PI*radius;
		return circumference;
	}
	public static double Calculate_pyramid1(double base, double height, double width) {
		double area2;
		
		area2 = base*width + Math.sqrt((Math.pow(width/2, 2))+ (Math.pow(height, 2))) + width*(Math.sqrt((Math.pow(base/2, 2))+ (Math.pow(height, 2))));
	    return area2;
	}
	public static double Calculate_pyramid2(double base, double height, double width) {
		double volume;
		volume = (base*height*width)/3;
		return volume;
	}
    
	public static void main(String[] args) {
		System.out.println("This code requires the user to enter inputs in the string format");
		Scanner scnr = new Scanner(System.in);
		String choice;
		double radius1;
		double base1;
		double height1;
		double width1;
		System.out.println("Enter your choice: (Enter the word 'circle' or 'pyramid') ");
		choice = scnr.next();
		if (choice.equals("circle")) {
			System.out.println("Enter the radius of the circle: ");
			radius1 = scnr.nextDouble();
			System.out.println("The area of the circle is: " + Calculate_circle1(radius1) + " and the circumference is: "+ Calculate_circle2(radius1));
			
		}
		else if (choice.equals("pyramid")) {
			System.out.println("Enter the base of the pyramid: ");
			base1 = scnr.nextDouble();
			System.out.println("Enter the height of the pyramid: ");
			height1 = scnr.nextDouble();
			System.out.println("Enter the width of the pyramid: ");
			width1 = scnr.nextDouble();
			System.out.println("The area of the pyramid is: " + Calculate_pyramid1(base1, height1, width1)+ " and the volume is: "+ Calculate_pyramid2(base1,height1,width1));
			
		}
		else {
			System.out.println("Invalid input ");
	}
}

}



