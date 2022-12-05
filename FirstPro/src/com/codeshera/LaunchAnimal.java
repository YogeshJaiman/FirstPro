package com.codeshera;

class Dog{
	private int num;
	private String name;
	
	public Dog() {
		//super();
		this(10);
		System.out.println("no argument");
	}
	
	public Dog(int a) {
		this(10,20);
		System.out.println("one argument " + a);
	}
	
	public Dog(int a, int b) {
		System.out.println("call with 2 parameter " + a + " "+ b);
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class LaunchAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
//		Dog d2 = new Dog(10,20);
	}

}
