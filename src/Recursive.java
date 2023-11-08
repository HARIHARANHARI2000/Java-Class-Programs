
public class Recursive {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int val=8;
		int i=0;
		recursive(a,val,i,i+1);
	}
	private static void recursive(int[]a,int val,int i)
	{
		if(a.length==i) {
			return;
		}
		else {
			if(a[i]==val) {
			System.out.println("lower bound:"+i);
			return;
			}
			else {
			recursive(a,val,i+1);
		}
		}
	}
}
		
