import java.util.Scanner;
class BankAccount{
    static Scanner sc1=new Scanner(System.in);
    private String accountHolderName;
    private static int accountNumber;
    private static double accountBalance;
    
    static{BankAccount.accountBalance=0.0;BankAccount.accountNumber=10000;}
    
    public BankAccount() {
        this(null);
    }
    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public String getaccountHolderName() {
        return accountHolderName;
    }
    public void setaccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public int getaccountNumber() {
        return accountNumber;
    }
    public void setaccountNumber(int accountNumber) {
        BankAccount.accountNumber = accountNumber;
    }
    public double getaccountBalance() {
        return accountBalance;
    }
    public static void setaccountBalance(double accountBalance) {
        BankAccount.accountBalance = accountBalance;
    }
    void Create_account(String name){
        setaccountHolderName(name);
        setaccountNumber(getaccountNumber()+1);
    }
    void Deposit_money(double Money){
        setaccountBalance(getaccountBalance()+Money);
    }
    void Withdraw_money(double Money){
        setaccountBalance(getaccountBalance()-Money);
    }
    void Display_balance(int accountNumber){
        if(getaccountNumber()==accountNumber)
        System.out.println("Your Balance is Rs-"+getaccountBalance()); 
    }
    void Display_account_holder_information(){
        System.out.println("Enter Account Number: ");
        if(sc1.nextInt() == getaccountNumber()){
        System.out.println("Account Holder Name: "+getaccountHolderName());
        System.out.println("Account Balance: "+getaccountBalance());
        }
    }
}

public class BankAccountManager {
    static Scanner sc = new Scanner(System.in);
    static int showMenu(){
            System.out.println("Enter an option:");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money into an account");
            System.out.println("3. Withdraw money from an account");
            System.out.println("4. Display the account balance");
            System.out.println("5. Display the account holder's information");
            System.out.println("6. Exit");
            return sc.nextInt();
    }
    
    public static void main(String[] args){
        BankAccount B=new BankAccount();
        boolean bln=true;
        while(bln==true){
            int choice=BankAccountManager.showMenu();
            sc.nextLine();
            switch(choice){
              case 1:
              System.out.println("Enter your Name:- ");
              String n=sc.nextLine();
              B.Create_account(n);
              System.out.println("Thanks for creating an account with Us"+n+"ur A/c No:"+B.getaccountNumber());
              break;

              case 2:
              System.out.print("Enter your AccountNumber:- ");
              if(sc.nextInt()==B.getaccountNumber()){
                System.out.println("Enter Amount you want to Deposit: ");
                B.Deposit_money(sc.nextDouble());
                System.out.println("Money Deposited and Your Balnce is Rs"+B.getaccountBalance());
              }
              break;

              case 3:
              System.out.print("Enter your AccountNumber:- ");
              if(sc.nextInt()==B.getaccountNumber()){
                System.out.println("Enter Amount you want to Withdraw: ");
                B.Withdraw_money(sc.nextDouble());
                System.out.println("Money withdrawn Successfully and Your Balnce is Rs"+B.getaccountBalance());
              }
              break;

              case 4:System.out.print("Enter your AccountNumber:- ");
              int ac=sc.nextInt();
              B.Display_balance(ac);
              break;

              case 5:
              B.Display_account_holder_information();
              break;

              case 6:
              bln=false;

              default:
              System.out.println("Thank you for visiting ");
              break;
            }
        }
    }
}