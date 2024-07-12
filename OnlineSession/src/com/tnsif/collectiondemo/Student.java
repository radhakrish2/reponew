package com.tnsif.collectiondemo;

public class Student implements Comparable<Student> {
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
		//return this.rollNo - o.rollNo;
	}

	
	
	
	
}
