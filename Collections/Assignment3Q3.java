import java.util.*;
import java.lang.*;


public class Assignment3Q3 {
    
    public static void main(String[] args) {

    	ArrayList<String> al =new ArrayList<String>();
    	al.add("a");
    	al.add("b");
    	al.add("c");
    	al.add("d");
    	al.add("e");

    	System.out.println(traverseReverse(al));
    }

    public static List<String> traverseReverse(ArrayList<String> aList){
    	ListIterator<String> li = aList.listIterator(aList.size()); 

    	List<String> mylist = new ArrayList<String>();

    	while (li.hasPrevious()) {
           mylist.add(li.previous());
        }

    	return mylist;
    }
}


