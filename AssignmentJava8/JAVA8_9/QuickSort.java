package JAVA8_9;

import java.util.ArrayList;
import java.util.Collections;

public class QuickSort {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(7);
		al.add(8);
		al.add(4);
		System.out.println("Elements of the ArrayList " + "before sorting : " + al);

		Collections.sort(al, (o1, o2) -> (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0);

		System.out.println("Elements of the ArrayList after" + " sorting : " + al);
	}
}
