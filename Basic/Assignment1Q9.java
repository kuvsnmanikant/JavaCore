import java.lang.*;
import java.util.*;

public class Assignment1Q9 {
    public static void main (String [] args) {

    	Scanner ss=new Scanner(System.in);

    	Student[] ar= new Student[3];

    	for (int i=0;i<3;i++){

    		System.out.println("enter the marks of student "+(i+1));

    		System.out.print("subject A :");
    		int sa=ss.nextInt();

    		System.out.print("subject B :");
    		int sb=ss.nextInt();

    		System.out.print("subject C :");
    		int sc=ss.nextInt();

    		ar[i]= new Student(sa,sb,sc);

    	}
    	
    	Student s = new Student();

    	System.out.println("total marks of all students : "+s.studentsTotalMarksInAllSubjects(ar));
    	System.out.println("total average of all students : "+s.studentsAverageMarksInAllSubjects(ar));

        System.out.println("------------------------------------------------------------");

        int[] a=s.subjectWiseMarks(ar,"subjectA");
        int[] b=s.subjectWiseMarks(ar,"subjectB");
        int[] c=s.subjectWiseMarks(ar,"subjectC");

        System.out.print("subjectA marks of all students : "); printarr(a);
        System.out.print("subjectB marks of all students : "); printarr(b);
        System.out.print("subjectC marks of all students : "); printarr(c);

        System.out.println("------------------------------------------------------------");

        System.out.println("subjectA Total marks of all students : "+s.subjectATotalByStudents(a));
        System.out.println("subjectB Total marks of all students : "+s.subjectBTotalByStudents(b));
        System.out.println("subjectC Total marks of all students : "+s.subjectCTotalByStudents(c));

        System.out.println("------------------------------------------------------------");

        System.out.println("subjectA average of all students : "+s.subjectAAverageByStudents(a));
        System.out.println("subjectB average of all students : "+s.subjectBAverageByStudents(b));
        System.out.println("subjectC average of all students : "+s.subjectCAverageByStudents(c));



    }

    public static void printarr(int[] a){
        for (int i=0;i<3;i++){System.out.print(a[i]+" ");}System.out.println("");
    }

} 


class Student {
    private int subjectA,subjectB,subjectC;

    Student(int a, int b, int c){subjectA=a; subjectB=b; subjectC=c;}


    public Student() {super();}


    public int studentsTotalMarksInAllSubjects(Student[] students) {
    	return (students[0].subjectA+students[1].subjectA+students[2].subjectA+students[0].subjectB+students[1].subjectB+students[2].subjectB+students[0].subjectC+students[1].subjectC+students[2].subjectC);
    }



    public double studentsAverageMarksInAllSubjects(Student[] students) {
    	return (students[0].subjectA+students[1].subjectA+students[2].subjectA+students[0].subjectB+students[1].subjectB+students[2].subjectB+students[0].subjectC+students[1].subjectC+students[2].subjectC)/3;
    }



    public int[] subjectWiseMarks(Student[] students,String subjectName){

    	if (subjectName=="subjectA"){int[] ar={(students[0].subjectA), (students[1].subjectA), (students[2].subjectA)}; return ar;}

    	else if (subjectName=="subjectB"){int[] ar={(students[0].subjectB), (students[1].subjectB), (students[2].subjectB)}; return ar;}

        else{int[] ar={(students[0].subjectC), (students[1].subjectC), (students[2].subjectC)}; return ar;}
    }



    public int subjectTotalByStudents(int[] marks){return (marks[0]+marks[1]+marks[2]);}



    public int subjectATotalByStudents(int[] marks) {return subjectTotalByStudents(marks);}
    public int subjectBTotalByStudents(int[] marks) {return subjectTotalByStudents(marks);}
    public int subjectCTotalByStudents(int[] marks) {return subjectTotalByStudents(marks);}

    public double subjectAverageByStudents(int[] marks) {return subjectTotalByStudents(marks)/3;}


    public double subjectAAverageByStudents(int[] marks) {return subjectAverageByStudents(marks);}
    public double subjectBAverageByStudents(int[] marks) {return subjectAverageByStudents(marks);}
    public double subjectCAverageByStudents(int[] marks) {return subjectAverageByStudents(marks);}

}   
