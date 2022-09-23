package com.collection.demo;

import java.util.PriorityQueue;
import java.util.Stack;
class Student implements Comparable{
	int Student_id;
	
	public Student(int Student_id) {
		
		this.Student_id=Student_id;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.Student_id - ((Student)o).Student_id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student_id = "+Student_id;
	}
}

public class Manager18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue pqueue = new PriorityQueue();
		
		pqueue.add(new Student(1101));
		pqueue.add(new Student(1001));
		pqueue.add(new Student(1301));
		pqueue.add(new Student(1201));
		
		System.out.println(pqueue);
		
		/*
		pqueue.add(9);
		pqueue.add(99);
		pqueue.add(19);
		pqueue.add(900);
		pqueue.add(29);
		pqueue.add(8);
		pqueue.add(87);
		//pqueue.add("abc");Error
		
		pqueue.add(8);
		
		System.out.println(pqueue);
		
		System.out.println(pqueue.poll());
		
		System.out.println(pqueue);
		*/
		//Stack stk = new S
		
		Stack stk = new Stack();
		
		stk.push("abc");
		
		
		stk.push("xyz");
		stk.push("zyv");
		stk.push(10);
		stk.push(30);
		stk.push(true);
		System.out.println(stk);
		
		stk.pop();
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);

	}

}
