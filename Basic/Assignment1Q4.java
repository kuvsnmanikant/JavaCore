import java.lang.*;
import java.util.Scanner;
class ResultDeclaration {
    public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks)
    {
        String st=" ";
        if((subject1Marks+subject2Marks+subject3Marks)<60||subject1Marks>60||subject2Marks>60||subject3Marks>60)
        {
            st="failed";
        }
        else if((subject1Marks+subject2Marks>60)||(subject2Marks+subject3Marks>60)||(subject3Marks+subject1Marks>60))
        {
            st= "passed\npromoted";
        }
        else if ((subject1Marks+subject2Marks+subject3Marks)>60)
        {
            st="passed";
        }

        return st;
    }
}
public class Assignment1Q4 {
    public static void main(String[] args) {
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
