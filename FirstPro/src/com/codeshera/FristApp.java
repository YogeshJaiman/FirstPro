package com.codeshera;

class Employee{
	
	int empid;
	String name;
	String address;
	
	void work() {
		System.out.println("Development!");
	}
}


public class FristApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Employee emp1 = new Employee();
	  emp1.empid = 100;
	  emp1.name = "Ram";
	  emp1.address = "Jaipur";
	  
	  emp1.work();
	  
	  System.out.println(emp1.empid);
	  System.out.println(emp1.name);
	  System.out.println(emp1.address);
	}

}
