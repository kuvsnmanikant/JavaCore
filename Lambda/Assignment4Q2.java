import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Assignment4Q2 {

    private int totalPrice;
    private String status;

    Assignment4Q2(int a,String b){totalPrice =a; status =b;}

    public int getTotalPrice() {return totalPrice;}
    public String getStatus() {return status;}


	public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {
	 Predicate<Assignment4Q2> c = e -> (e.getTotalPrice()<10000 || (!e.getStatus().equals("ACCEPTED") && !e.getStatus().equals("COMPLETED"))); 
    	 orders.removeIf(c);  	
    	 return orders;
    }



	public static void main(String[] args) {

    	Scanner ss= new Scanner(System.in);
    	ArrayList<Assignment4Q2> al= new ArrayList<Assignment4Q2>();

    	System.out.print("enter the number of order : ");
    	int i= ss.nextInt();

    	for (int j=1;j<=i;j++){

    		System.out.print("enter the price of order "+j+" : ");
	    	int p= ss.nextInt();

	    	System.out.print("enter the status of order "+j+" : ");
	    	String s= ss.next();

	    	al.add(new Assignment4Q2(p,s));

    	}

    	listOfOrders(al).forEach(n -> System.out.println(n));

    }

    public String toString(){ return "Price : "+this.totalPrice+"  status: "+this.status+"  ";}
}
