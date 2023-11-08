package training1;

public class pratice {
	//public class Sorting {
		public void bubblesort()
		{
			int n=12325;
			int temp=n,rev=0,rem;
	while(n>0) {
	rem=n%10;
	rev=rev*10+rem;
	n=n/10;
	}
	if(temp==rev)
	System.out.println("Palindrome");
	else
		System.out.println("Not a Palindrome");
	//s.close();
		}

}
