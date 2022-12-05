package com.codeshera;

class Student {
	
	private int id;
	private String name;
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}


public class SecondApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student stu1 = new Student();
		
        stu1.setId(10);
		stu1.setName("Sham");
		stu1.setAddress("Delhi");
		
	    System.out.println(stu1.getId());
	    System.out.println(stu1.getName());
	    System.out.println(stu1.getAddress());
	}

}
