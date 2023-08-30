package training;
import java.util.Scanner;
class Surface{
	public void surface_cone(int r,int l) {
		double d=3.142*r*(l+r);
		System.out.println("The surface area of cone :"+d);
	}
}
class Volume{
	public void volume_cone(int r,int h) {
		double d=1.0/3*3.142*r*r*h;
		System.out.println("The volume of cone :"+d);
	}
}

public class Volume_surface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Surface s=new Surface();
		Volume v=new Volume();
		int r,h,l;
		System.out.println("Enter the radius of cone :");
		r=sc.nextInt();
		System.out.println("Enter the length of cone :");
		l=sc.nextInt();
		System.out.println("Enter the height of cone :");
		h=sc.nextInt();
		s.surface_cone(r,l);
		v.volume_cone(r, h);
		
		
	}

}
