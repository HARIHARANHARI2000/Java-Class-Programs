package Class_Program;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int rem,sum=0,temp=n;
		String str=String.valueOf(n);
		while(n>0) {
			rem=n%10;
		}
		if(sum==temp) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not an Armstrong number");
		}
		s.close();

	}

}
