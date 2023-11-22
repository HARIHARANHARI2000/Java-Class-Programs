package Abstract;

import java.util.Scanner;

public class FibEx {

	public static void main(String[] args) {
	     int n=5;
		int count=1, total = 0;
		
		while(count<=n) {
			
			total=total+count;
			
			count++;
		}
		System.out.println(total);
		
	}
}

