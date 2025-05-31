public class BankAccount {
    private double balance;
    void deposit(double amt){
        balance = balance + amt ;
    }
    double getBalance(){
        return balance;
    }
}
class BankDetails{
     public static void main(String[] args){
        BankAccount obj = new BankAccount();
        obj.deposit(550);
        //System.out.println("Amount Balance: " +obj.balance);
        // Error : The field BankAccount is not visible
        System.out.println("Account Balance: " + obj.getBalance());
    }
}
