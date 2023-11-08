package Class_Program;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int first,second;
		double result=0;
		char ch;
		System.out.print("Enter the first number:");
		first=s.nextInt();
		System.out.print("Enter the second number:");
		second=s.nextInt();
		System.out.print("Enter the operator(+,-,*,/):");
		ch=s.next().charAt(0);
		switch(ch) {
		case'+':
			result=first+second;
			break;
		case'-':
			result=first-second;
			break;
		case'*':
			result=first*second;
			break;
		case'/':
			result=first/second;
			break;
			default:
				System.out.println("Error! operator is not correct");
		}
		System.out.printf("%d %c %d=%.2f\n",first,ch,second,result);
		System.out.println(first+""+ch+""+second+"="+result);
		s.close();
		

	}



}
