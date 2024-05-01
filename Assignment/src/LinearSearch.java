import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int a[]=new int[sc.nextInt()];
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
}
int k=sc.nextInt();
for(int i=0;i<a.length;i++) {
	if(a[i]==k) {
		System.out.println(i);
	}
}
	}
}
