// 3 subjects pass or fail



import java.lang.*;
import java.util.*;

public class Assignment1Q4 {
    public static void main (String [] args) {

    	Scanner ss=new Scanner(System.in);

    	System.out.print("Enter the subject1Marks : ");
        double s1=ss.nextDouble();

        System.out.print("Enter the subject2Marks : ");
        double s2=ss.nextDouble();

        System.out.print("Enter the subject3Marks : ");
        double s3=ss.nextDouble();

        ResultDeclaration obj = new ResultDeclaration();

        System.out.println(obj.declareResults(s1,s2,s3));

    }
}    


class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {

    	double a,b,c;
    	a=subject1Marks;
    	b=subject2Marks;
    	c=subject3Marks;

    	int co=0;

    	if (a>=60.0){co++;}
    	if (b>=60.0){co++;}
    	if (c>=60.0){co++;}

    	if (co==3){return "Passed";}
    	else if (co==2){return "Promoted";}
    	else {return "Failed";}

    }
}