
public class Compare {

	public static void main(String[] args) {
		Integer num1=1;
		Integer num2=10;
		System.out.println(num1.compareTo(num2));
		System.out.println(num1.equals(num2));
		String a="hello";
		String b="hello";
		if(a.equals(b)) {
			System.out.println("Both Strings are equal");
		}
		if(a.compareTo(b)==0) {
			System.out.println("Both Strings are equal");
		}
		System.out.println(Math.min(12,20));
		System.out.println(Math.max(12,24));
		Integer int1=20;
		System.out.println(String.valueOf(int1));
		System.out.println(int1.floatValue());
		System.out.println(int1.doubleValue());
	}

}
