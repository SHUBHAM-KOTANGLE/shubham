package com.test;

public class PracticeConstructor {
	
	
	
}
 class cars{
	
	int weels;
	String name;
	double mileage;
	
	public cars (){
		System.out.println("default constructor");
	}
	public cars(int weels,String name,double mileage) {
	this.weels=weels;
	this.name=name;
	this.mileage=mileage;
	}
	
	


public static void main(String[] args) {

cars lamborghini = new cars (3,"Aventadoor",3.535);
System.out.println(lamborghini.weels+""+lamborghini.name+""+lamborghini.mileage);

}
}
