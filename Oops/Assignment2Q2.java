import java.lang.*;
import java.util.*;

public class Assignment2Q2 {

    int salary = 10000;
    
    public int getSalary(int salary){return salary;}

    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){

    	int sum=0;
    	for (Integer i : employeeSalaries){sum+=i;}
    	return sum;	

    }

    public static void main(String[] args) {

    	Assignment2Q2 obj =new Manager();
    	Assignment2Q2 obj1 =new Labour();
  
    	//int a=obj.getSalary(obj.salary);
    	//int b=obj1.getSalary(obj.salary);

    	ArrayList<Integer> c = new ArrayList<>();
    	c.add(obj.getSalary(obj.salary));
    	c.add(obj1.getSalary(obj.salary));

    	//int d= obj.totalEmployeesSalary(c);
    	System.out.print(obj.totalEmployeesSalary(c));
    }
}


class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return (incentive+salary);
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return (overtime+salary);
    }
}