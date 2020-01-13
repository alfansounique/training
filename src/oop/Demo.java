package oop;



class Person {
	
	String name;
	String email;
	String phone;
	
	
	
	void walk(){
		System.out.println(name + " is walking");
	}
	
	void eat(){
		System.out.println(email);
	}
	
	void sleep(){
		System.out.println(name + "is Sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
	Person person1 = new Person();
	person1.name = "alfanso";
	person1.email = "alfansobarr@yahoo.com";
	person1.phone = "4927212";
	
	
	person1.walk();
	
	}

}
