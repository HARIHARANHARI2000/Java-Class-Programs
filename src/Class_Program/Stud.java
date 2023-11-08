package Class_Program;

import java.util.Scanner;

public class Stud {
	int stud_id=1;
	String stud_name;
	void print(int id1, String name1) {
		stud_id=id1;
		stud_name=name1;
		System.out.println("Student id:"+stud_id);
		System.out.println("Student Name:"+stud_name);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Student id:");
		int id=s.nextInt();
		System.out.print("Enter the Student name:");
		String name=s.next();
		Stud obj=new Stud();
		obj.print(id,name);
		s.close();

	}

}
