import java.util.Scanner;

class Bank_Account{
    private String Account_no;
    private double balance;


    public Bank_Account(String Account_no, double balance) {
        this.Account_no = Account_no;
        this.balance = balance;
    }

    public String getAccount_no() {
        return Account_no;
    }

    public void setAccount_no(String Account_no) {
        this.Account_no = Account_no;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        if(this.balance - amount < 0){
            System.out.println("Insufficient funds");
        }
        else{
            this.balance -= amount;
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class Saving_Account extends Bank_Account{
    
        public Saving_Account(String Account_no, double balance) {
            super(Account_no, balance);
        }

        public void withdraw(double amount){
            if(this.getBalance() - amount < 100){
                System.out.println("Minimum Balance should be 100");
            }
            else{
                super.withdraw(amount);
            }
        }
    
    }



public class bank_transaction {
    public static void main(String[] args) {
        Saving_Account s= new Saving_Account("123456789", 1000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited");
        int x = sc.nextInt();
        s.deposit(x);

        System.out.println("Enter the amount to be withdrawn");
        int y = sc.nextInt();
        s.withdraw(y);
    }
}
