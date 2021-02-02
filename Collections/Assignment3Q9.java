
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Assignment3Q9 {
    public static void main(String[] args) {
        
        TreeSet<SavingAccount> ts = new TreeSet<>(Comparator.comparing(SavingAccount::getAcc_ID));
        Scanner ss= new Scanner(System.in);
        
        ts.add(new SavingAccount(30.0,3,"h1",true));
        ts.add(new SavingAccount(25.0,2,"h2",false));
        
        BankAccountList b =new BankAccountList(ts);
        
        System.out.print("enter the nmber of savings accounts : ");
        int ne=ss.nextInt();

        for (int i=0;i<ne;i++){

            System.out.print("enter the account ID              : ");
            int m=ss.nextInt();
            
            System.out.print("enter the account balance         : ");
            double d=ss.nextDouble();

            System.out.print("enter the account holder name     : ");
            String y=ss.next();

            System.out.print("enter is it salary account or not : ");
            boolean n=ss.nextBoolean();

            b.addSavingAccount(new SavingAccount(d,m,y,n));
        }
        
        b.displaySavingAccountIds().forEach(f -> System.out.println(f));

    }
}



class SavingAccount {

    private double acc_balance;
    private int acc_ID;
    private String accountHolderName;
    private boolean isSalaryAccount;
    
    
    public SavingAccount(double acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) {
        super();
        this.acc_balance = acc_balance;
        this.acc_ID = acc_ID;
        this.accountHolderName = accountHolderName;
        this.isSalaryAccount = isSalaryAccount;
    }
    
    
    public double getAcc_balance() {return acc_balance;}
    public int getAcc_ID() {return acc_ID;}
    public String getAccountHolderName() {return accountHolderName;}
    public boolean getisSalaryAccount() {return isSalaryAccount;}
    
    
    public void setAcc_balance(double acc_balance) {this.acc_balance = acc_balance;}
    public void setAcc_ID(int acc_ID) {this.acc_ID = acc_ID;}
    public void setAccountHolderName(String accountHolderName) {this.accountHolderName = accountHolderName;}
    public void setSalaryAccount(boolean isSalaryAccount) {this.isSalaryAccount = isSalaryAccount;}
    
    
}

class BankAccountList{

    private TreeSet<SavingAccount> savingAccounts = new TreeSet<>(Comparator.comparing(SavingAccount::getAcc_ID));
    
    public BankAccountList() {super();}

    public BankAccountList(TreeSet<SavingAccount> savingAccounts) {
        super();
        this.savingAccounts = savingAccounts;
    }
    
    int  a= savingAccounts.size();

    public boolean addSavingAccount(SavingAccount savingAccount) {
        savingAccounts.add(savingAccount);
        int b= savingAccounts.size();
        if (b==a) {return false;}
        return true;
    }

    public List<Integer> displaySavingAccountIds() {
        List<Integer> l = new ArrayList<>(); 
        savingAccounts.stream().forEach(e -> l.add(e.getAcc_ID()));
        return l;
    }
}

