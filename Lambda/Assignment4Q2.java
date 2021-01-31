import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Assignment4Q2 {

    private int totalPrice;
    private String status;

    Assignment4Q2(int a,String b){totalPrice =a; status =b;}

    public int getTotalPrice() {return totalPrice;}
	public String getStatus() {return status;}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + totalPrice;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Assignment4Q2 other = (Assignment4Q2) obj;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (totalPrice != other.totalPrice)
			return false;
		return true;
	}



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

    	//System.out.print(listOfOrders(al));
    	//for (Assignment4Q2 m : listOfOrders(al)) { System.out.println(m);}
    	
    	listOfOrders(al).forEach(n -> System.out.println(n));

    }

    public String toString(){ return "Price : "+this.totalPrice+"  status: "+this.status+"  ";}
}
