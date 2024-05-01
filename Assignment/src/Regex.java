import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int a=0,b=0,nc=0,d=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='A' && c<='Z') {
				a++;
			}
			else if(c>='a' && c<='z') {
				b++;
			}
			else if(c>='0' && c<='9') {
				nc++;
				}
			else {
				d++;
			}
		}
if(a>=1 && b>=1 && nc>=1 && d>=1) {
	System.out.println("Yes");
}
else {
	System.out.println("No");
}
	}

}
