package Access_Modifier;

public class Sum1 {
	int x;
	void local_var() {
		int a=2;
		a=a+7;
		System.out.println("a="+a);
	}
	void print() {
		System.out.println("x="+x);
		
	}

	public static void main(String[] args) {
		Sum1 s=new Sum1();
		s.local_var();
		System.out.println("x="+s.x);

	}

}
