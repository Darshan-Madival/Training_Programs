package training;
class student{
	private int roll_no;
	private int sub_1;
	private int sub_2;
	
	public void set_data(int roll_no,int sub_1,int sub_2) {
		this.roll_no=roll_no;
		this.sub_1=sub_1;
		this.sub_2=sub_2;
	}
	public void get_data() {
		System.out.println("Roll no: "+roll_no);
		System.out.println("Subject 1: "+sub_1);
		System.out.println("Subject 2: "+sub_2);
		System.out.println("The average of sub 1 and sub 2 :"+(float)((sub_1+sub_2)/2));
		
	}
	public String toString(){
		return roll_no+" "+sub_1+" "+sub_2+" "+(float)((sub_1+sub_2)/2);
	}
}

public class Student_year {

	public static void main(String[] args) {
		student obj=new student();
		obj.set_data(11, 90, 95);
		obj.get_data();
		System.out.println(obj);

	}

}
