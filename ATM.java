import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Transaction{
    String type;
    double amount; 
    Transaction(String type,double amount){
        this.type=type;
        this.amount=amount;

    }
    public String toString(){
        return type + ": Rs." + amount;
    }
}

 class Account{
        private String name;
        private double amount;
        private LocalDateTime timestamp;
        private double balance;
         private int accountNumber;

      private ArrayList<Transaction> transactions=new ArrayList<>();

         public Account(String name, int accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
            this.balance = 0;
        }

        public void Deposite(double amount){
            if(amount>0);{
            balance+=amount;
            transactions.add(new Transaction("Deposite", amount));
            System.out.println("deposite succesfully!");
        }
    }

            public void Withdraw(double amount) {
                if(amount > 0 && amount <= balance){
                balance -=amount;
                transactions.add(new Transaction("withdrawal",amount));
                System.out.println("withdraw succesfully!");
            } else {
                System.out.println("Insufficent balance or invaild amount");
            }
        }
        public void checkbalance(){
            System.out.println("Current Balance: Rs." + balance);
        }
            
         public void viewTransactions(){
                if(transactions.isEmpty());{
                    System.out.println("No transactions yet");
                } else {
                    for(Transaction t : transactions) {
                        System.out.println(t);
                    }
                }
            }

            public String getName(){
                return name;
            }
            public int getAccountNumber(){
                return accountNumber;
            }
        }
                
        

public class ATM {
    static Scanner sc = new Scanner(System.in);
    static Account account;
    public static void main(String[] args) {
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        int accountNo = new Random().nextInt(10000) + 10000;
        account = new Account(name, accountNo);
        System.out.println("Account created succesfully.Account Number:");
                    int choice;
            do {
                System.out.print("\n1.Deposit\n2.Withdraw\n. Check Balance\n4.View Transactions\n5.Exit");
                             choice = sc.nextInt();
    
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        account.Deposite(dep);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double with = sc.nextDouble();
                        account.Withdraw(with);
                        break;
                    case 3:
                        account.checkbalance();
                    break;
                case 4:
                    account.viewTransactions();
                    break;
                case 5:
                    System.out.println("Thank you for using the Bank App.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        
    }
}


class Transactions{
    String type;
    double  amount;

    public Transactions(String type,double amount) {
        this.type=type;
        this.amount=amount;
    }
    

}

class Accounts{
    private    String name;
     private  int accountNumber;
    private    double balance;

    public Accounts(String name,int accountNumber,double balance) {
        this.accountNumber=accountNumber;
        this.name=name;
        this.balance=balance;
    }
    
    ArrayList<Transaction> transactions=new ArrayList<>();
 
     public  void deposit(){


     }
}

    class ATM{
        public static void main(String[]args){

        }

    }


