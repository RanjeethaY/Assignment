import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int l=0,h=a.length-1,m=0;
		while(l<h) {
			m=(l+h)/2;
			if(a[m]==k) {
				System.out.println(m);
				break;
			}
			else if(k>a[m]) {
				l=m+1;
			}
			else {
				h=m-1;
			}
		}

	}

}
