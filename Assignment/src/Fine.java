import java.util.Scanner;

public class Fine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      int n=sc.nextInt();
	      int d=sc.nextInt();
	      int c[]=new int[n];
	      int f[]=new int[n];
	      for(int i=0;i<n;i++) {
	    	c[i]=sc.nextInt();
	      }
	      int fine=0;
	      for(int i=0;i<n;i++) {
		    	f[i]=sc.nextInt();
		    }
	      if(d%2==0) {
	    	  for(int i=0;i<n;i++) {
	    		  if(c[i]%2!=0) {
	    			  fine+=f[i];
	    		  }
	    	  }
	      }
	      System.out.println(fine);
	}

}
