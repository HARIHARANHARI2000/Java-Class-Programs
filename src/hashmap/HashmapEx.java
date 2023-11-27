package hashmap;

import java.util.HashMap;

public class HashmapEx {
	static boolean answer=false;
	
	public static void main(String[] args) {
		HashMap<String,String>hashmap=new HashMap<String,String>();
		hashmap.put("Name","Hari");
		hashmap.put("Age","23");
		hashmap.put("Gender","Male");
		hashmap.put("etc",".....");
		System.out.println(hashmap.get("Name"));
		System.out.println(hashmap.get("Age"));
		System.out.println(hashmap.get("Gender"));
		System.out.println(hashmap.get("etc"));
		System.out.println(hashmap.size());
		System.out.println("contains: "+hashmap.containsKey("address"));
		System.out.println("contains: "+hashmap.containsKey("Name"));
		System.out.println("contains: "+hashmap.remove("Name"));
		System.out.println("contains: "+hashmap.containsKey("Name"));
	}

}
