package JAVA8_1;
/*WAP to check the given no is palindrome or not. Don’t use divide 
method*/

import java.util.stream.IntStream;

public class TestPalindrome {
	public static void main(String[] args) {

		int number = 101;
		int reduce = IntStream.iterate(number, i -> i / 10).map(n -> n % 10).limit(String.valueOf(number).length())
				.reduce(0, (a, b) -> a = a * 10 + b);
		if (number == reduce) {
			System.out.println("Number is palindrome " + reduce);
		} else {
			System.out.println(number + "not a palindrome ");
		}
	}
}
