package Access_Modifier.Sub_Modifier;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Linkedlist {
	public static void  main(String args[]) {
		String[] sString= {"BMW","FORD"};
		String[] sNewString=new String[2];
		sString[0]="Audi";
		//sString[3]="Audi";
		sNewString[0]="BMW";
		sNewString[1]="FORD";
		// sNewString[2]="Audi";
		LinkedList<String> cars=new LinkedList<String>();
		cars.add("BMW");
		cars.add("Tata");
		cars.add("FORD");
		System.out.println(cars.get(2));
		//cars.forEach(t-> System.out.println(t));
		//List<String> nums=new ArrayList<>();
		//nums.
	}

}
