package recursion;
import java.util.*;
public class Sum_of_digits { //how to find the sum of digits of a positive integer number using recursion.
	public static void main(String[]args) {
		System.out.println(sum(-10)); 
	}
	public static int sum(int n) {
		if(n<0) {
			return 0;
		}
		if(n%10==n) {
			return n;
		}
		return (n%10)+sum(n/10);
	}

}
