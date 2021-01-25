import java.util.*;
import java.lang.*;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {return totalDeposits*creditLimit;}
}


class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {return totalDeposits*fixedDepositAmount;}
}


public class Assignment2Q3 {
    
    public int totalCashInBank(ArrayList<Integer> cash){ 
        int sum=0; 
        for (int i : cash) {sum+=i;} 
        return sum;
    }


    public int getCash(){ return 0;}


    public static void main(String[] args) {

        ArrayList<Integer> cash =new ArrayList<>();

        Assignment2Q3 o= new SavingsAccount();
        Assignment2Q3 ob= new CurrentAccount();

        cash.add(o.getCash());
        cash.add(ob.getCash());

        System.out.println(o.totalCashInBank(cash));

    }
}