package com.yash.oops9;

public class Finalize {
	public static void main(String[] args) {
		MyEmployee e1 = new MyEmployee(201);
		MyEmployee e2 = new MyEmployee(202);
		MyEmployee e3 = new MyEmployee(203);
		MyEmployee e4 = new MyEmployee(204);
		MyEmployee e5 = new MyEmployee(205);

		e2 = null;
		e5 = null;
		System.gc();

		for (int i = 1; i < 6; i++) {
			String e = "e" + i;
			System.out.println(e + ":" + e.hashCode());
		}
		System.out.println("e2=" + e2);
		System.out.println("e5=" + e5);

	}

}
