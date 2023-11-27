package hashmap;

import java.util.HashMap;

public class HashEx {
      static boolean answer=false;
	public static void main(String[]args) {
		
		//HashMap<String , String>hashMap=new HashMap<String,String>();
		HashMap<String,String>hashmap=new HashMap<String,String>();
		/*hashmap.put("Name","Hari");
		hashmap.put("Age","23");
		hashmap.put("Gender","Male");
		hashmap.put("etc",".....");*/
		
	
	/*HashMap<Integer,String>hashMap2=new HashMap<Integer,String>();
	hashMap2.put(10,"Ram");
	System.out.println(hashMap2.get(10));
	
	HashMap<String, Integer>hashMap3=new HashMap<String,Integer>();
	hashMap3.put("test",30 );
	System.out.println(hashMap3.get("test"));
	
	HashMap<Integer, Double>hashMap4=new HashMap<Integer, Double>();
	hashMap4.put(11,29);
	System.out.println(hashMap4.get(11));
	String search="34w";*/
	
	String search="23w";
	hashmap.forEach((key,value)->{
		if(key.contains(search)||value.contains(search)) {
			answer=true;
		}
	});
	System.out.println(search+"contains"+answer);
		



}
}
