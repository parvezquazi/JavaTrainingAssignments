package com.yash.oops9;

public class MyEmployee {

	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}

	public MyEmployee(int id) {
		super();
		this.id = id;
	}

	public MyEmployee() {
		super();
	
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("id= " + this.id);
	}

}
