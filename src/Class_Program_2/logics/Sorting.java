package Class_Program_2.logics;


	public class Sorting {
		public static void main(String[] args) {
		int j;
		int [] arr= {1,50,6,49,33,20};
			for(int i=0;i<arr.length;i++) {
				for(j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						int temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
					}
				}
				System.out.println(arr[i]);
			}
	}
	}
		


