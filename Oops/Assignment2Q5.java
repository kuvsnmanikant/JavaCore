import java.lang.*;
import java.util.*;

public class Assignment2Q5{
    public static void main(String[] args) {

    	Rectangle5 o= new Rectangle5();
    	System.out.println(o.draw());

    	Line5 ob= new Line5();
    	System.out.println(ob.draw());

    	Cube5 obj= new Cube5();
    	System.out.println(obj.draw());


    }
}

class Rectangle5 extends Shape5 {
    @Override
    public String draw() {return ("Rectangle5 class");}
}

class Line5 extends Shape5{
    @Override
    public String draw() {return ("Line5 class");}
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {return ("Cube5 class");}
}
abstract class Shape5 {
    abstract public String draw();
}