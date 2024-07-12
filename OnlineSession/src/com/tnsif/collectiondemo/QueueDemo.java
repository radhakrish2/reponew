package com.tnsif.collectiondemo;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		
		
		Queue<Student> queue = new PriorityQueue<>();
		
		queue.add(new Student(105,"Priyanka"));
		queue.add(new Student(110,"Akshata"));
		queue.add(new Student(102,"Keerthana"));
		queue.add(new Student(103,"Arati"));
		queue.add(new Student(104,"Sachin"));
		
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		
		
		

	}

}
