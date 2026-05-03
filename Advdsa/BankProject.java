
abstract class Bankaccount{
     private String accountholder;
    private double balance; 
 

public Bankaccount(String accountholder, double balance) {
    this.accountholder = accountholder;
    this.balance = balance;
}

public double getBalance() {
    return balance;
}
public void setBalance(double balance) {
    this.balance = balance;
}
public String getAccountholder() {
    return accountholder;
}
public void setAccountholder(String accountholder) {
    this.accountholder = accountholder;
}
public Bankaccount(String accountholder) {
    this.accountholder = accountholder;
    this.balance = balance;
}

public void deposit (double amount){
    if(amount > 0){
        this.balance += amount;
    }
}
public void withdraw(double amount){
    if(amount <= balance){
        balance -= amount;
    }
    else{
        System.out.println("Insufficient balance");
    }
}

abstract public void withdraw1(double amount);

}
class savingaccount extends Bankaccount {
    public savingaccount(String accountholder, double balance) {
        super(accountholder, balance);
    }

    @Override
    public void withdraw1(double amount) {
        if(amount <= getBalance()){
            setBalance(getBalance() - amount);
            System.out.println("withdraw successful");
        } else{
            System.out.println("Insufficient balance");
        }
    
        
    }

    
}

public class BankProject {
    public static void main(String[] args) {
        // Bankaccount bankaccount = new savingaccount( "anjali", 50000);
        Bankaccount bankaccount = new savingaccount("disha", 5000);
        bankaccount.deposit(1000);
        bankaccount.withdraw(2000);
        System.out.println(bankaccount.getBalance());
        System.out.println("Saving account");
        System.out.println(bankaccount.getAccountholder());
        System.out.println(bankaccount.getBalance());
    }
}
