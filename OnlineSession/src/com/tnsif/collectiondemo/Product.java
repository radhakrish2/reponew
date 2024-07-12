package com.tnsif.collectiondemo;

public class Product implements Comparable<Product> {
	int id;
	double price;
	String name;
	public Product(int id, double price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return id + "\t" +  name +"\t"+ price;
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.getId();
	}
	
	
	
}
