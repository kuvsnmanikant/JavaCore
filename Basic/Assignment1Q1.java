// amstrong number

import java.lang.*;
import java.util.*;
class ArmstrongOrNot {
	 public boolean armstrongCheck(int n) {
	 	int c=0,a,tem;    
	    tem=n;  
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    if(tem==c){  
	        return true; }  
	    else{  
	        return false; }
	 }

}

public class Assignment1Q1 {
    public static void main(String[] args) {

    	Scanner ss=new Scanner(System.in);
        int a=ss.nextInt();
        
        ArmstrongOrNot obj=new ArmstrongOrNot();
    	System.out.println(obj.armstrongCheck(a));

    }
}
