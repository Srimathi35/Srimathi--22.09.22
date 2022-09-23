package com.collection.demo;

import java.util.LinkedHashSet;

public class Manager16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet lset =new LinkedHashSet();
		
		lset.add(10);
		lset.add(20);
		lset.add(30);
		lset.add(40);
		lset.add(50);
		lset.add(60);
		lset.add(70);
		lset.add(80);
		lset.add(null);
		lset.add("allow");
		
		System.out.println(lset);
		
		/*  hashset                        LinkedHashSet
		 * inserting order not apply       inserting order are apply
		 *
		 * java1.2                          java1.4
		 * Hashtable                                 Hashtable and LinkedList combination
		 */
		
		
	
	}

}
