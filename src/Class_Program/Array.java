package Class_Program;

public class Array {

	public static void main(String[] args) {
		int[]numbers= {10,20,30,40,50};
		String str2[]= {"one","two","three"};
		for(int i=0;i<numbers.length;i++) {
		System.out.print(numbers[i]+"");
		}
		System.out.println("\nFor each loop");
		for(int num:numbers) {
			System.out.print(num+"");
		}
		System.out.println("\nString Array:");
		for(int i=0;i<str2.length;i++) {
			System.out.print(str2[i]+"");
		}
System.out.println("\nFor each loop-String array");
for(String num:str2) {
	System.out.println(num+"");
}
}
}
