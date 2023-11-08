import java.util.Scanner;

public class Yes_No {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,k;
		n=s.nextInt();
		k=s.nextInt();
		int a[]=new int[n];
		
		//r=s.nextInt();
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			if(a[i]%k==0)
				System.out.print("1 ");
			else
				System.out.print("0 ");
			
		}
		//if(n>l&&n<r)
			//System.out.println("yes");
		//else
			//System.out.println("no");
	}

}
