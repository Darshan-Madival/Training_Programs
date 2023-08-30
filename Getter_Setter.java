package training;

class Employee
{
// class member variable
private int Empno;
private String Empname;
private int salary;
// setter method to set data values
public void setdata(int Empno,String Empname,int salary)
{
this.Empno=Empno;
this.Empname=Empname;
this.salary=salary;
}
// getter method to print or return
public void getdata()
{
System.out.println("Empno : "+Empno);
System.out.println("Empname : "+Empname);
System.out.println("Salary : "+salary);
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
}
// using toString() method
public String toString()
{
return Empno+ " "+Empname+" "+salary;
}
}
// Main class.
public class Getter_Setter
{
// main method
public static void main(String argvs[])
{
// Creating an object of the Employee class
final Employee e = new Employee();
// the employee details are getting set using the setter method.
e.setdata(101,"Ram Kumar",34000);
// Displaying the details of the employee details using the getter method
e.getdata();
// Displaying using toString()
System.out.println(e);
}

}
