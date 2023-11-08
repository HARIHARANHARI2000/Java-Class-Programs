package Access_Modifier;

public class Emp_Modifier {
	int emp_id;
	String emp_name;
	double Salary;
	public Emp_Modifier() {
		emp_id=1;
		emp_name="Hari";
		Salary=10000;
	}
	void getEmp() {
		System.out.println("Employee id:"+emp_id);
		System.out.println("Employee name:"+emp_name);
		System.out.println("Salary="+Salary);
		}
	public static void main(String[] args) {
		Emp_Modifier ob=new Emp_Modifier();
		System.out.println("State Emp_id:"+ob.emp_id);
		System.out.println("Getter Method Calling");
		ob.getEmp();
		
	}

}
