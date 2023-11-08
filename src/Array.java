
public class Array {

	public static void main(String[] args) {
		int[] arr= {7,5,9,6};
		
		for(int i=0;i<arr.length;i++) {
			//System.out.println("first temp: "+arr[i]);
			for(int j=i+1;j<arr.length;j++) {
				//System.out.println("second temp: "+arr[j]);
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
			}
			System.out.print(" "+arr[i]);
				}
				}
			}
				
			
	


