// WAP to print the number of alphabets repeated in the given string.

package com.yash.string;

public class RepeatedAlphabets {
	public static void main(String[] args) {
		String str = "Scannia";
		int count = 0;
		int length = str.length();
		char[] arr = str.toCharArray();
		for (int i = 0; i < length; i++) {
			for (int j = 1 + i; j < length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate characters are:" + arr[j]);
					count++;

				}
			}
		}
		System.out.println("Number of Duplicate characters are: " + count);
	}

}
