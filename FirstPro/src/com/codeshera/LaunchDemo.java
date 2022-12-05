package com.codeshera;

public class LaunchDemo {
	
	int sum(byte a, byte b) {
		System.out.println("float");
		return a+b;
	}

	int  sum(int a, int b) {
		System.out.println("double");
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaunchDemo l1 = new LaunchDemo();
		System.out.println(l1.sum(1, 1));
	}

}
