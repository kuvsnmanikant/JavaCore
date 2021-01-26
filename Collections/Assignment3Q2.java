import java.lang.*;
import java.util.*;

public class Assignment3Q2 {
    public static void main(String[] args) {

        HashSet<String> set=new HashSet<String>();  
        System.out.println("HashSet "+unordered(set));  


        LinkedHashSet<String> lset = new LinkedHashSet<String>();  
        System.out.println("LinkedHashSet "+ordered(lset));
           
    }

 /* public static LinkedHashSet ordered(LinkedHashSet linkedHashSet){ } i didnt use this because it is showing 
 Note: Assignment3Q2.java uses unchecked or unsafe operations.
 Note: Recompile with -Xlint:unchecked for details.
*/
    public static LinkedHashSet<String> ordered(LinkedHashSet<String> linkedHashSet){

    	linkedHashSet.add("One");    
    	linkedHashSet.add("Two");    
    	linkedHashSet.add("Three");   
    	linkedHashSet.add("Four");  
    	linkedHashSet.add("Five"); 
    	linkedHashSet.add("Six");	
        return linkedHashSet; 

    }

    public static HashSet<String> unordered(HashSet<String> hashSet){
    
    	hashSet.add("One");    
    	hashSet.add("Two");    
    	hashSet.add("Three");   
    	hashSet.add("Four");  
    	hashSet.add("Five"); 
    	hashSet.add("Six");	
        return hashSet;   
    }
}