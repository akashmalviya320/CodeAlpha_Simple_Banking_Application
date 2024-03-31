import java.util.Scanner;
class BankingApp{
        private static double balance = 0;
        private static Scanner sc = new Scanner(System.in);

    void menu(){
        
        BankingApp obj0=new BankingApp();
        boolean Status = true;
        while (Status) {
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Please enter your choice: ");
        int choice = sc.nextInt();
            switch (choice) {
                //Calling deosit method for deposit option.
                case 1:
                    obj0.deposit();
                    break;

                //Calling withdraw method for withdraw option.
                case 2:
                    obj0.withdraw();
                    break;

                //Calling checkBalance method for checkBalance option.
                case 3:
                    obj0.checkBalance();
                    break;

                //Calling exit method for exit option.
                case 4:
                    Status=false;
                    System.out.println("Thank you for using the banking app.\n Have a Good Day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
    }

    //Depositing money
    private void deposit(){
            
            System.out.print("Enter the amount: ");
            double amount=sc.nextDouble();
            if (amount>0) {
                balance=balance+amount;
                System.out.println("Deposited. Current balance:  "+balance);
            }
            else {
                System.out.println("Entered invalid amount");
            }
           
    }

    //Withdrawing money
    private void withdraw(){
        System.out.print("Enter the amount: ");
        double amount=sc.nextDouble();
        if (amount>0 && amount<=balance){
            balance=balance-amount;
            System.out.println("Withdrawal successful. Current balance: "+balance);
        } 
        else{
            System.out.println("Entered invalid amount or insufficient balance.");
        }
    }

    //Checking balance
    private void checkBalance(){

        System.out.println("Current balance: "+balance);
        
    }
    
}
public class Task2 {
    public static void main(String[] args) {     
        BankingApp objmain=new BankingApp();  
        System.out.println("Welcome User !");
        System.out.println("Please enter the number according to options given below");
        System.out.println("Banking Menu:");

        objmain.menu();
    }
   
}
