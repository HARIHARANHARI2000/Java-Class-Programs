
public class bitwise {

	public static void main(String[] args) {
		int a=5,b=15,result;
		//System.out.println("a="+a)
		System.out.println("a&b="+(a&b));
		System.out.println("~b="+(~b));//
		result=(a>b)?a:b;
		//System.out.println("Biggest number="+result);
		if(a>b)
			System.out.println("a is greater:"+a);
		else
			System.out.println("b is greater:"+b);
		a=9;
		a++;

	}

}
