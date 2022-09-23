package com.collection.demo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Manager20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap entry = new HashMap();
		
		entry.put(1, "raja");
		
		entry.put(2, "java");
		entry.put(3, "python");
		entry.put(4, "asp");
		
		entry.put(null, "asp");
		
		//entry.put("key", "python");
		entry.put(5, "c");
		//entry.put("lang", "tamil");
	//	entry.put(true, false);
		
		System.out.println(entry);
		
		
		System.out.println(entry.get(4));
		
		System.out.println(entry.get("key"));
		
		System.out.println(entry.get(true));
		System.out.println(entry.get("lang"));
		
		Set key = entry.keySet();
		
		System.out.println(key);
		
		Iterator mapread =key.iterator();
		Object objkey,value;
		
		while(mapread.hasNext())
		{
			objkey=mapread.next();
			value = entry.get(objkey);
			
			System.out.println(objkey + ", "+value);
			//System.out.println(mapread.next()  + ", "+ entry.get(mapread.next()));
		}
		
		
		Hashtable ht = new Hashtable();
		
		ht.put("abc","value 1");
		ht.put(1,"value 1");
		
		
		System.out.println(ht);
	
	}

}
