package com.collection.demo;

import java.util.LinkedList;
import java.util.List;

public class Manager13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list=new LinkedList();
		
		list.add("java");
		
		list.add("angular");
		
		list.add("raj");
		list.add("java 17");
		
		list.add("java SE");
		
		
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		list.poll();//read and remove first elements
		//list.poll();
	//	list.poll();
		//list.poll();
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list.peek());
		
		System.out.println(list);
		
		
	}

}
