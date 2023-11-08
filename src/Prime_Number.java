import java.util.LinkedList;
public class Prime_Number {
	public static void main(String[] args) {
		int arr[]= {13,17,21,31,5,999991,23,25};
		LinkedList<Integer>res=new LinkedList<Integer>();
		int loop=0;
	       for(int i=1;i<arr.length;i++) {
	    	   int remainder_loop=0;
	    	   
	    		  System.out.println(arr[i]);
	    		  for(int j=1;j<arr[i];j++) {
	    			  if(arr[i]%j==0) {
	    				  remainder_loop++;
	    			  }
	    		  loop++;
	    		  }
	    		  if(remainder_loop==0) {
	    			  System.out.println(arr[i]+"is a prime number");
	    		  }
	    		  else {
	    			  System.out.println(arr[i]+"is not a prime number");
	    		  }
	}
	}
}
	
	    

