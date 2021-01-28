import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Assignment5Q3 {
       public static void main(String[] args) {
    	
    	List<Trader> list = new ArrayList<>();
		Scanner ss= new Scanner(System.in);
		
		System.out.print("enter the number of traders you want to enter : ");
		int n= ss.nextInt();
		
        for(int i=1;i<=n;i++) {
	   		 
	   		System.out.print("enter the name of trader "+i+"  : ");
	   		String pu= ss.next();
			
			System.out.print("enter the city of trader "+i+" : ");
			String cu= ss.next();
	   	    
	   	    System.out.println("--------------------------------------------");
	   		 
	   		list.add(new Trader(pu,cu));
	   	 }
        printUniqueCities(list).forEach(k-> System.out.println(k));
        System.out.println("--------------------------------------------");
        trader2sFromPuneSortByName(list).forEach(k-> System.out.println(k));
        System.out.println("--------------------------------------------");
        System.out.println(allTrader3Names(list));
        System.out.println("--------------------------------------------");
        areAnyTrader4sFromIndore((ArrayList<Trader>)list).forEach(f -> System.out.println(f));
    }
       
       
       public static List<String> printUniqueCities (List <Trader> traders) {
         /*  List<String> a= new ArrayList<>();
           Set<String> s= traders.stream().map(p -> p.getCity()).collect(Collectors.toSet());
           a = s.stream().collect(Collectors.toList()); */
	       
	   List<String> a=(List<String>) traders.stream().map(p->p.getCity()).distinct().collect(Collectors.toList());    
           return a;
       }
       
       

       public static List<String> trader2sFromPuneSortByName(List <Trader> traders) {
    	  
    	   List<String> l = new ArrayList<String>();
    	   traders.stream().filter(c -> c.getCity().equalsIgnoreCase("pune")).sorted(Comparator.comparing(e -> e.getName())).forEach(e -> l.add(e.getName()));
    //	   Collections.sort(l);
    	   return l;

       }
       
       
       
       public static String allTrader3Names(List <Trader> traders) {
    	   
    	   String a="";
    	   List<String> l = new ArrayList<>();
    	   traders.stream().forEach(e -> l.add(e.getName()));
    	   Collections.sort(l);
    	   
    	   for(String s: l){a=a+s;}
    	   return a;
       }
       
       
       
       public static ArrayList<Trader> areAnyTrader4sFromIndore(ArrayList<Trader> traders) {
    	   
    	   ArrayList<Trader> l = new ArrayList<Trader>();
    	   traders.stream().filter(c -> c.getCity().equalsIgnoreCase("indore")).forEach(e -> l.add(e));
    	   return l;
       }
    
}



class Trader {
    private String name;
    private String city;
    
    
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	
	public String getName() {return name;}
	public String getCity() {return city;}
	
	
    public String toString(){ return "Trader1{name='"+this.name+"', city='"+this.city+"'}";}

}
