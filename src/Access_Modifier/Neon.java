package Access_Modifier;

import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int temp=n;
		int sum=0;
		n=n*n;
		System.out.println("The Square of the number is"+n);
		while(n!=0) {
			int r=n%10;
			n=n/10;
			sum=sum+r;
		}
			System.out.println("num"+sum);
			if(sum==temp)
				System.out.println("The number is neon number:");
			else 
				System.out.println("it is not a Neon number:");
			}
	}


