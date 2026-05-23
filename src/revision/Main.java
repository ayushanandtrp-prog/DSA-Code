package revision;
class Account{
    String Accountholder;
    private double balance;
    Account(String Accountholder , double balance){
        this.Accountholder = Accountholder;
        this.balance = balance;
    }
    void deposite(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("deposited " +amount);
        }
        else{
            System.out.println("Invalid Amount ");
        }
    }
    void withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
            System.out.println("Withdraw suces " + amount);
        }
        else{
            System.out.println("Insefecent fund");
        }
    }
    void displaybalance(){
        System.out.println("Balance is " +balance);
    }


}
public class Main {
    public static void main(String[]args){
        Account ac = new Account("Ayush Anand" , 40000); 
        ac.deposite(1000);
        ac.withdraw(3000);
        ac.displaybalance();

    }
}
