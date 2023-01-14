package arrays;

public class Second_largest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,1,3,5,7,19,2};
		int max1=a[0];
		int max2=0;
		for(int i=0;i<a.length;i++) {
			if(max1<a[i]) {
				max2=max1;
				max1=a[i];
			}
		}
		System.out.println(max1);
		System.out.println(max2);

	}

}
