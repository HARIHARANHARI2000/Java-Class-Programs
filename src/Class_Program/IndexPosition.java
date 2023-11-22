package Class_Program;

public class IndexPosition {

	public static void main(String[] args) {
		String s1="Ranjith kumar";  
		
		int index1=s1.indexOf("is");
		int index2=s1.indexOf("index");
		System.out.println(index1+"  "+index2);
		  
		
		int index3=s1.indexOf("is",4);
		System.out.println(index3);
		  
		
		int index4=s1.indexOf('h');
		System.out.println(index4);
	
	}

}
