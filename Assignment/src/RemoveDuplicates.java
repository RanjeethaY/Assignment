import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	       String s=sc.next();
	       LinkedHashSet<Character> l = new LinkedHashSet<Character>();
	       for(int i=0;i<s.length();i++) {
	    	   l.add(s.charAt(i));
	       }
	       for(char z:l)
	System.out.print(z);
	       
	     // 2 approach
	       char[] ch=s.toCharArray();
	       for(int i=0;i<ch.length;i++) {
	    	   for(int j=1+i;j<ch.length;j++) {
	    		   if(ch[i]==ch[j]) {
	    			   ch[j]=' ';
	    		   }
	    	   }
	       }
	       for(char c:ch)
	       if(c!=' ') {
	    	   System.out.print(c);
	       }
	}

}
