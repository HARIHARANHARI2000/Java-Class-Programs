import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt();
		int sum=a+b;
		if(a%2==0)
			System.out.println("odd");
		else
			System.out.println("even");
	}

}
