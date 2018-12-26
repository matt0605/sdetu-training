package oop;

//OOP
class Person {

	String name;
	String email;
	String phone;

	void walk() {

		System.out.println(name + " is walking");

	}

	void eat() {

		System.out.println(name + " is eating");

	}

	void sleep() {

		System.out.println(name + " is sleeping");

	}

}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate and object
		Person person1 = new Person();
		Person person2 = new Person();
		
		//Define the properties
		person1.name = "Joe";
		person1.email = "ss@smail.com";
		person1.phone = "1111111111";

		person2.name = "Sarah";
		person2.email = "22@smail.com";
		person2.phone = "6111111111";
		
		//Abstractiion
		person1.walk();
		person1.sleep();
		person1.eat();
		
		
		person1.walk();
		person2.sleep();
		
		
		
		/*
		 * String name = "Joe"; String email = "ssss@ymail.com"; String phone =
		 * "111111111";
		 * 
		 * walking(name);
		 * 
		 * String name2 = "Sarah"; String email2 = "ssss@ymail.com"; String
		 * phone2 = "111111111";
		 * 
		 * walking(name2);
		 */

	}

	public static void walking(String name) {
		System.out.println(name + " is walking!");

	}

}
