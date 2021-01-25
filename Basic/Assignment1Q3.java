// simple and compound interest

import java.lang.*;
import java.util.*;

public class Assignment1Q3 {
    public static void main (String [] args) {

    	Scanner ss=new Scanner(System.in);

    	System.out.print("Enter the Principal : ");
        double p=ss.nextDouble();

        System.out.print("Enter the Rate of interest : ");
        double r=ss.nextDouble();

        System.out.print("Enter the Time period : ");
        int t=ss.nextInt();

        SiCi obj =new SiCi();

        System.out.println("simpleInterest is : "+obj.simpleInterest(p,t,r));
        System.out.println("compoundInterest is : "+obj.compoundInterest(p,t,r));

    }
}    


class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){

    	double p,r,t,total;
    	p=principalAmount;
    	r=interestRate;
    	t=time;

    	total =(p*r*t)/100;

    	return total;

    }
    public double compoundInterest(double principalAmount,int time,double interestRate){

    	double p,r,t,total;
    	p=principalAmount;
    	r=interestRate/100;
    	t=time;

    	total=(p*Math.pow(1+r,t))-p;

    	return total;
    }
}
