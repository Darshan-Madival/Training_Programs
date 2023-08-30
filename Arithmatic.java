package training;

public class Arithmatic {
	public static void add(int a,int b) {
		System.out.println("The addition of two numbers is :"+(a+b));
	}
	public static void sub(int a,int b) {
		System.out.println("The substraction of two numbers is :"+(a-b));
	}
	public static void mul(int a,int b) {
		System.out.println("The mul of two numbers is :"+(a*b));
	}
	public static void div(float a,float b) {
		System.out.println("The division of two numbers is :"+(a/b));
	}
  public static void main(String[] args) {
	  add(12,12);
	  sub(12,10);
	  mul(5,2);
	  div(5,2);
  }
}
