/*WAP to demonstrate how memory is allocated to string objects in memory heap and string 
constant pool*/
package com.yash.string;

public final class Memory_allocation_String {
	public static void main(String[] args) {
		String s1 = "xyz";
		String s2 = "xyz";

		String s3 = new String("jkl");
		String s4 = new String("jkl");
		// Note that this == compares whether
		// s1 and s2 refer to same object or not

		// scp
		if (s1 == s2)
			System.out.println("Yes");
		else
			System.out.println("No");

		// Heap
		if (s3 == s4)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}
