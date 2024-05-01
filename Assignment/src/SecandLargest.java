import java.util.Scanner;

public class SecandLargest {
 public static void main(String ap[]) {
	 
	 Scanner sc = new Scanner(System.in);
		int a[]=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int m1=Integer.MIN_VALUE,m2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>m1) {
				m2=m1;
				m1=a[i];
			}
			else if(a[i]>m2 && a[i]!=m1) {
				m2=a[i];
			}
		}
		System.out.println(m2);
 }
}
