package com.collection.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Manager12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 =new ArrayList<>();
		
		list1.add("raja");
		list1.add("java");
		list1.add("python");
		list1.add("angular");
		list1.add("spring");
		list1.add("spring boot");
		list1.add("Rest API");
		/*list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);*/
		System.out.println(list1);
		
		ListIterator<String> read =list1.listIterator();
		
		read.add("java 17");
		//read.set(list1.get(1));
		System.out.println("l to r");
		while(read.hasNext()) {
			System.out.print(read.next()+", ");
			
			
		}
		read.set("java 18");
		
		System.out.println();
		System.out.println("R to L");
		
		System.out.println(list1);
		
		/*while(read.hasPrevious())
		{
			System.out.print(read.previous() +", ");
		}*/
	}

}
