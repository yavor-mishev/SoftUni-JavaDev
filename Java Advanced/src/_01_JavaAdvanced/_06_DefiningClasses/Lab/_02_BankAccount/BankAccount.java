package _01_JavaAdvanced._06_DefiningClasses.Lab._02_BankAccount;

public class BankAccount {
    private static int counter = 1;
    private static double interestRate = 0.02;
    private int id;
    private double balance;

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }
}
