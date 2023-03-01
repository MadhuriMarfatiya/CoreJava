package in.co.collectionInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		HashMap map= new HashMap();
		map.put("1", "one");
		map.put("2", "Two");
		map.put("3", "Three");
		
		int size=map.size();//get size of map
		System.out.println("size : "+size);
		
		String val=(String)map.get("2");//get value of key 2
		System.out.println("value of key 2 :"+val);
		map.remove("1");//remove by key
		
		boolean flag=map.containsKey("1");//whether contains a mapping for k
		System.out.println("chcecks weather key value is available on map or not :"+flag);
		
	boolean	flag1=map.containsValue("Two");//whether contains a mapping for v
		System.out.println("wheather value two available on not on map :"+flag1);
		
		Set keys=map.keySet();//get keys
		for(Object k : keys) {
			System.out.println(k);
		}
		
		Collection values=map.values();//get values
		System.out.println("Valaues of maps are: "+values);
		
		Set keyValue=map.entrySet();//get key-value set
		System.out.println("all keyvalues will be printed: "+keyValue);
	}

}
