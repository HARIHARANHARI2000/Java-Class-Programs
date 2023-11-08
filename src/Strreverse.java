
public class Strreverse {

	public static void main(String[] args) {
		String string="abcdef 1234";
		String reverse=new StringBuffer(string).reverse().toString();
		System.out.println("String before reverse:"+string);
		System.out.println("String after reverse:"+reverse);
		String input="abcdef";
		char[]try1=input.toCharArray();
		for(int i=try1.length-1;i>=0;i--)
			System.out.println(try1[i]);
		System.out.println();
		String text="The Cat is on the table";
		System.out.print(text.contains("the"));
		
	}

}
