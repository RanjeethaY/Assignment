import java.util.Scanner;
import java.util.regex.Pattern;

public class KedansAlg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int m=Integer.MIN_VALUE;
		int s=0;
		for(int i=0;i<a.length;i++) {
			s+=a[i];
			if(m<s) {
				m=s;
			}
			if(s<0) {
				s=0;
			}
		}
System.out.println(s);
System.out.println(Pattern.matches("[(?=.*[A-Z])(?=.*[a-z])]+","asDf"));


	}

}
