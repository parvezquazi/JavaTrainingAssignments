/*WAP to demonstrate how garbage collector work when any memory is not referenced by string 
object.*/
package com.yash.string;

public class GarbageCollectorDemo {
	String st;

	public GarbageCollectorDemo(String st) {
		super();
		this.st = st;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Garbage collected");
	}

	public static void main(String[] args) {
		GarbageCollectorDemo gc = new GarbageCollectorDemo("yash");
		gc = null;
		System.gc();
	}

}
