package oops;

public class InherMain {

	public static void main(String[] args) {
		ParentEx exp=new ParentEx(1);
		ParentEx exp1=new ParentEx("Hari");
		ChildEx childexp=new ChildEx();
		System.out.println("Print 1:"+exp1.primenumber());
		System.out.println("Print 2:"+exp1.test());
		System.out.println("Print 3:"+exp1.test());
		System.out.println("Print 4:"+childexp.test());
		
	}

}
