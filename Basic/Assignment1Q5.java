// finding tax amount

import java.lang.*;
import java.util.*;

public class Assignment1Q5 {
    public static void main (String [] args) {

    	Scanner ss=new Scanner(System.in);

    	System.out.print("Enter the amount : ");
        int t=ss.nextInt();

        TaxAmount obj = new TaxAmount();

        System.out.print("Tax is : "+obj.calculateTaxAmount(t));

    }
}    


class TaxAmount{
    public double calculateTaxAmount(int ctc){

    	double total=0;

    	if (ctc>180000 && ctc<300001){ctc=ctc-180000; total =ctc/10;}
    	if (ctc>300000 && ctc<500001){ctc=ctc-300000; total =12000+(ctc/5);}
    	if (ctc>500000){ctc=ctc-500000; total =52000+((ctc/10)*3);}

    	return total;
    }
}