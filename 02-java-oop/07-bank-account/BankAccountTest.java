import java.util.Random;

public class BankAccountTest{
    public static void main(String[] args) {
        BankAccount blah = new BankAccount();
        BankAccount kwah = new BankAccount();
        BankAccount mwah = new BankAccount();
        System.out.println("blah account num: " + blah.AccountNumber);
        System.out.println("kwah account num: " + kwah.AccountNumber);
        System.out.println("mwah account num: " + mwah.AccountNumber);
        System.out.println(blah.AccountNumber + "Balance is: " + blah.CheckingBalance);
        blah.addChecking(50.0);
        System.out.println(blah.CheckingBalance);
        blah.addChecking(500.0);
        System.out.println(blah.CheckingBalance);
        blah.subtractChecking(50.0);
        System.out.println(blah.getAccountCount());
        System.out.println(blah.getAccountBalances());
    }
}


//How to get these number of accout and sum of account working properly 
//How to call on an account by it's number rather than the background "name"
