
public class Biggest {

	public static void main(String[] args) {
		        int[] arr = {9, 7, 8, 6, 3, 1, 12, 2, 5};
		        
		        int smallest = arr[0];
		        int biggest = arr[0];
		        
		        for(int i=1; i<arr.length; i++) {
		            if(arr[i] < smallest) {
		                smallest = arr[i];
		            }
		            
		            if(arr[i] > biggest) {
		                biggest = arr[i];
		            }
		        }
		        
		        System.out.println("Smallest number: " + smallest);
		        System.out.println("Biggest number: " + biggest);


	}

}
