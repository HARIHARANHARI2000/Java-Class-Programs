
public class Same {

	public static void main(String[] args) {
		        int[] arr = {7, 8, 12, 6, 3, 4, 1, 9, 7, 6, 1, 4};
		        
		        for (int i = 0; i < arr.length; i++) {
		            for (int j = i + 1; j < arr.length; j++) {
		                if (arr[i] == arr[j]) {
		                    System.out.println(arr[i]);
		                }
		            }
		        }
		    }
		

}
