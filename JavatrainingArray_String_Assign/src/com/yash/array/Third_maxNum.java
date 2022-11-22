//WAP to find third maximum number from list of numbers.
package com.yash.array;

public class Third_maxNum {
	  public static void main(String args[]){
		   int temp, size;
		   int array[] = {3,7,6,4,1,8,9};
		   size = array.length;
		   
		   for(int i = 0; i<size; i++ ){
		      for(int j = i+1; j<size; j++){
		         if(array[i]>array[j]){
		            temp = array[i];
		            array[i] = array[j];
		            array[j] = temp;
		         }
		      }
		   }
		   System.out.println("Third largest number is: "+array[size-3]);
		   }

}
