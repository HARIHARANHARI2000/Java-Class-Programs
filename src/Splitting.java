import java.util.Scanner;

public class Splitting {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str1[]=str.split(" ");
		int a=Integer.parseInt(str1[0]);
		int b=Integer.parseInt(str1[1]);
		int c=Integer.parseInt(str1[2]);
		if(c*c==a*a+b*b)
			System.out.println("yes");
		else {
			System.out.println("no");
		}
			

	}

}
