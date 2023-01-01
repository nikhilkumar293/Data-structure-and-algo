package recursion;
import java.util.*;
public class Power {//calculate power of a number using recursion

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(power(2,10));
	}
	public static int power(int base,int exp) {
		if(exp<1) {
			return 1;
		}
		return base*power(base,exp-1);
	}
	

}
