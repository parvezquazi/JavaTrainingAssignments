//WAP to print the all alphabets of string in ascending and descending order.
package com.yash.string;

public class Ascending_and_Descending_Order {
	public static void main(String[] args) {       

		
		 String Name = "Parvez";
		 char a[] = Name.toCharArray();
		 System.out.println("The String characters in ascending orders are :");
		 for (int i = 0; i < a.length; i++) {
			 for (int j = i + 1; j < a.length; j++) {
				 if (a[i] > a[j]) {
					 char temp = a[i];
					 a[i] = a[j];
					 a[j] = temp;
				 }
			 }
			 System.out.print(a[i] + " ");
		 }
			 System.out.println(" ");
			 System.out.println("The String characters in descending orders are :");
			 for (int i = 0; i < a.length; i++) {
				 for (int j = i + 1; j < a.length; j++) {
					 if (a[i] < a[j]) {
						 char temp = a[i];
						 a[i] = a[j];
						 a[j] = temp;
					 }
				 }
				 System.out.print(a[i] + " ");
			 }

}
	}