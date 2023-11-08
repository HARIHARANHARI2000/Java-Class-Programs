
public class GCDprogram {

	public static void main(String[] args) {
		int n1=2,n2=6;
		int gcd=1;
		for(int i=1;i<=n1 && i<=n2;++i) {
			if(n1%i==0 && n2%i==0)
				gcd=i;
			
		}
		int lcm=(n1*n2)/gcd;
		System.out.println("The LCM of %d and %d is %d."n1,n2,lcm);
		System.out.println("GCD of"+n1+"and"+n2+"is"+gcd);
	}

}
