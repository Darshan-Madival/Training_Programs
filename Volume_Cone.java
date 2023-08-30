package training;

import java.util.Scanner;

public class Volume_Cone {
    public static double pi=3.142;
	public static void volume_cylinder(float r,float h) {
		double result=pi*r*r*h;
		System.out.println("The volume of cylinder :"+result);
		
	}
	public static void volume_cone(float r,float h) {
		double result=pi*r*r*h*0.3333;
		System.out.println("The volume of Cone :"+result);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float r,h;
		System.out.println("Enter the radius: ");
		r=sc.nextFloat();
		System.out.println("Enter the height: ");
		h=sc.nextFloat();
		Volume_Cone.volume_cone(r, h);
		Volume_Cone.volume_cylinder(r, h);
		
		

	}

}
