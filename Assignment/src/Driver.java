import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       String u=sc.next();
       String p=sc.next();
        userBo o = new  userBo();
       boolean ans=o.validate(u, p);
    if(ans) {
    	System.out.println("Loged in succesfully");
    }
    else {
    	System.out.println("Incorrect username/password");
    }
	
	}

}
