import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	double total=0.0d;

    	if(ctc>180000 && ctc<=300000){total=0.1*(ctc);}
    	if(ctc>300000 && ctc<=500000){total=0.2*(ctc);}
    	if(ctc>500000 && ctc<=1000000){total=0.3*(ctc);}
    	
    	return total;
    }
}
public class Assignment1Q5 {
    public static void main(String args[]) {
    	Scanner ss=new Scanner(System.in);

    	System.out.print("Enter the amount : ");
        int t=ss.nextInt();

        System.out.print("Tax is : "+new TaxAmount().calculateTaxAmount(t));
    }
}
