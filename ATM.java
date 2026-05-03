import java.util.*;

class Transaction {
    String type;
    double amount;

    Transaction(String type, double amount){
        this.type = type;
        this.amount = amount;
    }

    public String toString(){
        return type + " : Rs." + amount;
    }
}

class Account {
    private String name;
    private double balance;
    private int accountNumber;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account(String name, int accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount));
            System.out.println("Withdraw successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void checkBalance(){
        System.out.println("Current Balance: Rs." + balance);
    }

    public void viewTransactions(){
        if(transactions.isEmpty()){
            System.out.println("No transactions yet.");
        } else {
            for(Transaction t : transactions){
                System.out.println(t);
            }
        }
    }
}

public class ATM {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        int accountNo = new Random().nextInt(10000) + 10000;
        Account account = new Account(name, accountNo);

        System.out.println("Account created successfully!");
        System.out.println("Account Number: " + accountNo);

        int choice;

        do {
            System.out.println("\n1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.View Transactions");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter amount: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    account.viewTransactions();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 5);
    }
}

