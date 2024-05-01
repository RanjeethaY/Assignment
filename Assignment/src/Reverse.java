import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	String s=sc.next();
	String t="";
		for(int i=0;i<s.length();i++) {
			t=s.charAt(i)+t;
		}
System.out.println(t);
	}

}
