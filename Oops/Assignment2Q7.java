import java.lang.*;
import java.util.*;


public class Assignment2Q7 {

	Scanner ss = new Scanner(System.in);

    public static void main(String[] args) {

    	Assignment2Q7 o= new Assignment2Q7();
    	o.selectRoles();

    }



    private void selectRoles(){

    	System.out.println("enter the role :");
    	String a = ss.next();

    	new Assignment2Q7().roles(a);
    }



    private void roles(String role){

    	if(role.equals("owner")){ new Assignment2Q7().addItems();}
    	else { new Assignment2Q7().placeOrder();}
    }




    private void addItems() {
    	System.out.println("enter number of items you want to add max 3 : ");
    	int i= ss.nextInt();

    	for(int j=0;j<i;j++){

	    	System.out.println("enter 1 if you want to add candy");
	    	System.out.println("enter 2 if you want to add cookie");
	    	System.out.println("enter 3 if you want to add IceCream");

	    	int a= ss.nextInt();

	    	addItemsOperation(a);
        }

    }

    private void addItemsOperation(int choice) {
    	int b= choice;

    	if(b==1){
    		Candy ob= new Candy();

    		System.out.println("enter number of candies : ");
    		int a= ss.nextInt();

    		System.out.println("number of candies are : "+ob.addCandies(a));

    	}

    	if(b==2){
    		Cookie ob= new Cookie();

    		System.out.println("enter number of cookie : ");
    		int a= ss.nextInt();

    		System.out.println("number of cookie are : "+ob.addCookies(a));

    	}

    	if(b==3){
    		IceCream ob= new IceCream();

    		System.out.println("enter number of IceCream : ");
    		int a= ss.nextInt();

    		System.out.println("number of IceCream are : "+ob.addIceCreams(a));

    	}
    }




    private void placeOrder() {

    	System.out.println("enter number of items you want to order max 3 : ");
    	int i= ss.nextInt();

    	for(int j=0;j<i;j++){

	    	System.out.println("enter 1 if you want to order candy");
	    	System.out.println("enter 2 if you want to order cookie");
	    	System.out.println("enter 3 if you want to order IceCream");

	    	int a= ss.nextInt();

	    	placeOrderOperation(a);
        }
    }

    private void placeOrderOperation(int choice) {
    	int b=choice;

    	if(b==1){
    		Candy ob= new Candy();

    		System.out.println("enter number of candies : ");
    		int a= ss.nextInt();

    		System.out.println("cost of candies are : "+ob.orderCandies(a));

    	}

    	if(b==2){
    		Cookie ob= new Cookie();

    		System.out.println("enter number of cookie : ");
    		int a= ss.nextInt();

    		System.out.println("cost of cookie are : "+ob.orderCookies(a));

    	}

    	if(b==3){
    		IceCream ob= new IceCream();

    		System.out.println("enter number of IceCream : ");
    		int a= ss.nextInt();

    		System.out.println("cost of IceCream are : "+ob.orderIceCreams(a));

    	}

    }
}



abstract class DesertItem {

    abstract public int getCost();
}
class Candy extends DesertItem {
	static int can=10;
    public int addCandies(int candies){can+=candies;return can;}

    public int orderCandies(int o){
    	if(o>can){return 0;}
    	can-=o;
    	return (o*getCost());
    }

    public int getCost(){return 60;}

}
class Cookie extends DesertItem {
	static int can1=10;
    public int addCookies(int candies){can1+=candies;return can1;}

    public int orderCookies(int o){
    	if(o>can1){return 0;}
    	can1-=o;
    	return (o*getCost());
    }

    public int getCost(){return 70;}
}
class IceCream extends DesertItem {
	static int can2=10;
    public int addIceCreams(int candies){can2+=candies;return can2;}

    public int orderIceCreams(int o){
    	if(o>can2){return 0;}
    	can2-=o;
    	return (o*getCost());
    }

    public int getCost(){return 10;}
}

