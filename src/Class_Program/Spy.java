package Class_Program;

import java.util.Scanner;

public class Spy {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int sum=0,product=1,rem;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			product=product*rem;
			n=n/10;
		}
		if(sum==product) {
			System.out.println("Spy number");
		}
		else {
			System.out.println("Not a spy number");
		}
		s.close();

	}

}
