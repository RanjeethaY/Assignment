import java.util.Scanner;

public class Alternatemerge {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	int i=0;
	String t="";
	while(i<s1.length() && i<s2.length()) {
		t=t+s1.charAt(i)+s2.charAt(i);
		i++;
	}
	while(i<s1.length()) {
		t=t+s1.charAt(i);
		i++;
	}
	while(i<s2.length()) {
		t=t+s2.charAt(i);
		i++;
	}
System.out.println(t);
	}

}
