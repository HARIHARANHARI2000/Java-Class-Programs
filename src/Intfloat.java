
public class Intfloat {

	public static void main(String[] args) {
		Integer x=11;
		Float f=x.floatValue();
		System.out.println("Integer x="+x);
		System.out.println("Float Value f="+f);
		String str="10";
		Integer y=Integer.parseInt(str);
		Double d=y.doubleValue();
		System.out.println("y="+y);
		System.out.println("d="+d);
		System.out.println(d.toString());
		System.out.println(String.valueOf(y));
		System.out.println(Math.abs(10-20));
		System.out.println(Math.ceil(12.34));
		System.out.println(Math.floor(12.34));
		System.out.println(Math.round(12.54));
	}

}
