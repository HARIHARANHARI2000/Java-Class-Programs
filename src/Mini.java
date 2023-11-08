import java.util.Scanner;

public class Mini {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),min;

		int a[]=new int[n];

		for (int i=0;i<n;i++)

		a[i]=s.nextInt();
		
		min=a[0];
		
		for (int i=1;i<n;i++) {

		if(min>a[i])

		min=a[i];

	}
		System.out.println("Minimum num is: "+min);

	}

}
