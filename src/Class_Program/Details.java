package Class_Program;

import java.util.Scanner;

public class Details {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = s.nextInt();
		int arr[]= new int[n];
		/*
		 * arr[0]=10
		 * arr[1]=20
		 * arr[2]=30
		 * arr[3]=40
		 * arr[4]=50
		 n-1=4
		 */
		System.out.println("Enter the array elements one by one:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Array elements are stored in memory:");
		for(int i=0;i<n;i++) {
			if(i==n-1) {
				System.out.println(arr[i]);
			}
			else {
			System.out.println(arr[i]+",");
		}

	}

}
}
