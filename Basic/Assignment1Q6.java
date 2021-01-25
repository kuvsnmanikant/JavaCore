import java.lang.*;
import java.util.*;

public class Assignment1Q6 {
    public static void main (String [] args) {

    	Scanner ss=new Scanner(System.in);

        Login obj = new Login();

        for (int i=0;i<3;i++){

        	System.out.print("Enter the userId : ");
	        String user=ss.nextLine();

	        System.out.print("Enter the password : ");
	        String pass=ss.nextLine();

        	String a = obj.loginUser(user,pass);
        
        	if (a=="passed") {System.out.println("Welcome Ajay"); break;}

        	else if(a=="failed" && i!=2) {System.out.println("You have entered wrong credentials ,please enter the right credentials.");}

        	else {
					System.out.println("You have entered wrong credentials 3 times");
					System.out.println("Contact Admin");
					break;
                 }

    	}



    }
}  


class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {

    	String a=user;
    	String b=pass;

    	if(userId.equals(a)){

    		if(password.equals(b)){

    			return "passed";
    		}
    	}
    	
    	return "failed";	
    }

}
