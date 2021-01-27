import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Assignment5Q1 {

	public static void main(String[] args) {
		
		ArrayList<Fruit> list = new ArrayList<>();
		Scanner ss= new Scanner(System.in);
		
		System.out.print("enter the number of fruits you want to enter : ");
		int n= ss.nextInt();
		
        for(int i=1;i<=n;i++) {
	   		 
	   		System.out.print("enter name of fruit "+i+"         : ");
	   	    String f= ss.next();
	   		 
	   		System.out.print("enter the calories of fruit "+i+" : ");
			int c= ss.nextInt();
			
			System.out.print("enter the price of fruit "+i+"    : ");
			int p= ss.nextInt();
			
			System.out.print("enter color of fruit "+i+"        : ");
	   	    String co= ss.next();
	   	    
	   	    System.out.println("--------------------------------------------");
	   		 
	   		list.add(new Fruit(f,c,p,co));
	   	 }
        
        reverseSort(list).forEach(f -> System.out.println(f));
        System.out.println("--------------------------------------------");
        sort(list).forEach(f -> System.out.println(f));
        System.out.println("--------------------------------------------");
        filterRedSortPrice(list).forEach(f -> System.out.println(f));

	}
	
	
	public static List<String> reverseSort(ArrayList<Fruit> fruits) {
		List<String> l = new ArrayList<>(); 
		fruits.stream().filter(c -> c.getCalories() < 100).sorted(Comparator.comparing(Fruit::getCalories).reversed()).forEach(e -> l.add(e.getName()));
		return l;
	}
	
	
    public static ArrayList<Fruit> sort(ArrayList<Fruit> fruits) {
    	ArrayList<Fruit> l = new ArrayList<>();
    	Collections.sort(fruits, new Sortbycolor());
		fruits.stream().forEach(e -> l.add(e));
		return l;
    	
    }

    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits){
    	ArrayList<Fruit> l = new ArrayList<>(); 
		fruits.stream().filter(c -> c.getColor().equalsIgnoreCase("red")).forEach(e -> l.add(e));
		Collections.sort(l, new Sortbyprice());
		return l;
    }

}

class Fruit {
    private String name;
    private int calories;
    private int price;
    private String color;
    
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}

	public String getName() {return name;}
	public int getCalories() {return calories;}
	public int getPrice() {return price;}
    public String getColor() {return color;}

	public String toString(){ return "Fruit{name='"+this.name+"', calories="+this.calories+", price="+this.price+", color='"+this.color+"'}";}
}



class Sortbycolor implements Comparator<Fruit> 
{ 
    public int compare(Fruit a, Fruit b) { return a.getColor().compareTo(b.getColor()); } 
}



class Sortbyprice implements Comparator<Fruit> 
{ 
    public int compare(Fruit a, Fruit b) { return a.getPrice() - b.getPrice(); } 
}
