import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//System.out.print("Enter no.of elementd you want in array:");
		int n=s.nextInt();
		int count=0;
		int arr[]=new int[n];
		//System.out.println("Enter all the elements:");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int max=arr[0];
			//System.out.print("Enter the element of which you want to"+"count number of occurences:");
			//int search=s.nextInt();
			for(int i=1;i<n;i++) {
				if(arr[i]>max)
					max=arr[i];
			}
		if(count>0)
			System.out.println("Largest Element:"+max);
			s.close();
		}

	}


