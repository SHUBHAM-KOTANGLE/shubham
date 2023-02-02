package com.test;

public class PracticeConstructor2 {
	
	 
	}

class mobile{
	int price;
	String name;
	double processor;
	
	public mobile() {
		System.out.println();
	}
	
	public moblie (int price, String name, double processor) {
		this.price=price;
		this.name=name;
		this.processor=processor;
	}


public static void main(String[] args) {
	mobile apple=new mobile(80000,"i phone 14",4.5) ;
	System.out.println(apple.price+""+apple.name+""+apple.processor);
	
	mobile Sony=new mobile (70000, "Xperia xz 3",4.7);
	System.out.println(Sony.price+""+Sony.name+""+Sony.processor);
	
	
	
}}
