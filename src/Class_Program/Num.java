package Class_Program;

import java.util.Scanner;

public class Num {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		char ch;
		for(int i=n;i>=1;i--) {
			ch='a';
			for(int j=1;j<=i;j++) {
			System.out.print(ch++ +" ");
			}
			System.out.println();
		}
		s.close();

	}

}
