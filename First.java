 package training;

public class First {
	// non static method
	void display()
	{
	System.out.println("Hello World in display method");
	}
	// java program starts with class class_name which should be the name of the java file
	public static void main(String []args) {
	System.out.println("Hello World in main");
	int i=3;
	System.out.println(++i*8);
	int j=4;
	System.out.println(j++*8);
	System.out.println(j);
	// creating an object for calling non static method
	First f=new First();
	f.display();
	}
	}
