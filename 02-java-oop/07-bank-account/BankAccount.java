import java.util.Random;

public class BankAccount {
    public String AccountNumber = randNumber();
    public Double CheckingBalance = 0.0;
    public Double SavingBalance = 0.0;
    public static int numberOfAccounts = 0;
    public static Double sumOfBalances = 0.0;

    public String randNumber(){
        Random r = new Random();
        return Integer.toString(r.nextInt(899999999)+1000000000);
    }

    // Constructor
    public BankAccount(){
        this.AccountNumber = randNumber();
        this.CheckingBalance = 0.0;
        this.SavingBalance = 0.0;
        numberOfAccounts++;
        sumOfBalances = 0.0; 
    }

    public void addChecking(Double addCheck){
        this.CheckingBalance += addCheck + this.CheckingBalance;
        this.sumOfBalances = addCheck + this.sumOfBalances;
    }

    public void addSaving(Double addSave){
        this.SavingBalance += addSave + this.SavingBalance;
        this.sumOfBalances = addSave + this.sumOfBalances;
    }

    public void subtractChecking(Double withdrawCheck){
        if (this.CheckingBalance < withdrawCheck) {
            System.out.println("You have insufficient funds in your checking account");
        } else {
            System.out.println("The funds $" + withdrawCheck + " have been withdrawn");
            this.CheckingBalance -= withdrawCheck + this.CheckingBalance;
            this.sumOfBalances = withdrawCheck + this.sumOfBalances;
        }
    }

    public void subtractSaving(Double withdrawSave){
        if (this.SavingBalance < withdrawSave) {
            System.out.println("You have insufficient funds in your savings account");
        } else {
            System.out.println("The funds $" + withdrawSave + " have been withdrawn");
            this.SavingBalance -= withdrawSave + this.SavingBalance;
        }
        this.SavingBalance -= withdrawSave + this.SavingBalance;
        this.sumOfBalances = withdrawSave + this.sumOfBalances;
    }

    public void checkBalances(){
        System.out.println("Remaining checking balance: " + this.CheckingBalance);
        System.out.println("Remaining saving balance: " + this.SavingBalance);
    }
    //Methods go here
        // Getters and Setters
    public Double getCheckingBalance(){ 
        return this.CheckingBalance;
    }

    public Double getSavingBalance(){
        return this.SavingBalance;
    }
    
    public Integer getAccountCount(){
        return numberOfAccounts;
    }
    public Double getAccountBalances(){
        return sumOfBalances;
    }

}