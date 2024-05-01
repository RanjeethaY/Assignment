import java.util.Scanner;

public class Pallindrome {
public static void main(String ap[]) {
	Scanner sc = new Scanner(System.in);
	String s=sc.next();
	int i=0, j=s.length()-1;
	while(i<j) {
		if(s.charAt(i)==s.charAt(j)) {
			i++;j--;
		}
		else {
			System.out.println("Not Pallindrome");
			break;
		}
	}
	if(i==j)
		System.out.println("Yes");
}  
}
