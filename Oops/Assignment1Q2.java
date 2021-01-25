// list of armstrong numbers in between certain range

import java.lang.*;
import java.util.*;

public class Assignment1Q2 {
    public static void main (String [] args) {

       int min = 100;int max = 999;
       ArmstrongNumBetweenRange obj =new ArmstrongNumBetweenRange();

       int[] a=obj.armstrongNumbersInRange(min,max);

       for (int i = 0; i < a.length; i++) {
			System.out.print( a[i]+ " ");     
		}
    }
}

class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){

    	int co=0,j=0;

    	for (int i = min; i<=max; i++){
    		boolean a=armstrongCheck(i);
    		if(a==true){co++;}
    	}	

    	int[] arr=new int[co];
  

    	for (int i = min; i<=max; i++){
    		boolean a=armstrongCheck(i);
    		if(a==true){arr[j]=i;j++;}
    	}

    	return arr;
    }


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
