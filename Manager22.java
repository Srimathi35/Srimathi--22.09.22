package com.collection.demo;

import java.util.Comparator;
import java.util.TreeMap;

class Z3 implements Comparator{
	
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		return s2.compareTo(s1);
	}
}

public class Manager22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap tree = new TreeMap(new Z3());
		
		tree.put(201, "java");
		tree.put(101, "java");
		tree.put(111, "java");
		tree.put(103, "java");
		tree.put(109, "java");
		tree.put(211, null);
		
		//tree.put("valu 1", "java");  
		System.out.println(tree);
		
TreeMap tree1 = new TreeMap(new Z3());
		
		tree1.put("abc", "java");
		tree1.put("xyz", "java");
		tree1.put("qrs", "java");
		tree1.put("uvw", "java");
		tree1.put("fga", "java");
		tree1.put("puff", null);
		
		//tree.put("Value 1", "java");  
		System.out.println(tree1);
	}

}
