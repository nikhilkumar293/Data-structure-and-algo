package recursion;
import java.util.*;
public class Decimal_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(bin(10));
	}
	public static int bin(int n) {
		if(n<0) {
			return -1;
		}
		if(n/2==0) {
			return 1;
		}
		return n%2+10*bin(n/2);
	}

}
