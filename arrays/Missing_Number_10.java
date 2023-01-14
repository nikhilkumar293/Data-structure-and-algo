package arrays;
import java.util.*;
public class Missing_Number_10 {
	 public static int missingNumber(int[] intArray) {
         Arrays.sort(intArray);
        for(int i=0;i<intArray.length;i++){
            if(i!=intArray[i]){
                return i;

            }
        }
        return intArray.length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {3,0,1};
        System.out.println(arr);
	}

}
