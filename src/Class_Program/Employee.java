package Class_Program;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int id,contact,Gsalary,Nsalary;
		String name,address;
		id=s.nextInt();
		name=s.next();
		s.nextLine();
		address=s.nextLine();
		contact=s.nextInt();
		Gsalary=s.nextInt();
		if(Gsalary>40000)
			Nsalary=Gsalary+8000;
		else if(Gsalary>30000)
			Nsalary=Gsalary+7000;
		else if(Gsalary>20000)
			Nsalary=Gsalary+5000;
		else if(Gsalary>10000)
			Nsalary=Gsalary+3000;
		System.out.println("Employee Id:"+id);
		System.out.println("Employee Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Contact:"+contact);
		System.out.println("NSalary:"+Gsalary);
	}

}
