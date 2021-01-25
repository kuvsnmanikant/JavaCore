import java.lang.*;
import java.util.*;

public class Assignment2Q4 {

	public static void main(String[] args) {
	//	A obj =new A();  error we can not create a obj for abstract class to access it we must use inheritance

		B obj1=new B();
		obj1.fun1();
		obj1.fun2();

		D obj2=new D();

		F obj3=new F();
	}

}



abstract class A {           // If any class has any of its method abstract then you must declare entire class abstract.   
  public abstract void fun1();
  public void fun2() {
    System.out.println("abstract class");
  }
}


class B extends A{public void fun1(){System.out.println("B class");}}

abstract class C extends A{     // When we extend an abstract class, we must either override all the abstract methods in sub class or declare subclass as abstract.        
	public void fun3(){System.out.println("C class");}
}

class D extends C{public void fun1(){System.out.println("D class");}}




abstract class E{              // You can declare a class abstract without having any abstract method.
	public void fun4(){System.out.println("e class");}
} 

class F extends E{public void fun5(){System.out.println("F class");}}



/*
if we use final we can not override the abstract method (illegal combination of modifiers: abstract and final)

final abstract class G{
    public void fun6(){System.out.println("G class");}	   
}


it can not be private because it is not complete on it's own 

final abstract class H{
    public void fun7(){System.out.println("H class");}	   
}

*/