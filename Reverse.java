package training;
import java.util.Scanner;
public class Reverse {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the string: ");
	  String str=sc.next();
	  int a=str.length();
	  for(int i=a-1;i>=0;i--) {
		  System.out.print(str.charAt(i));
	  }
  }
}
