package com.yash.oops1;

public class TestMain_Person {

	public static void main(String[] args) {

		Employee employee = new Employee(1021547, "anand", " Pune", "2/6/1994", 2000, "5/2/21", "hinjewadi",
				"development", "90999999995", "anand@gmail.com");

		Customer customer = new Customer(107, "sujay", "Mumbai", "1/1/1989", "1/1/92", "baner", "8888888777",
				"sujay@gmail.com");

		System.out.println(employee);
		System.out.println(customer);

	}

}
