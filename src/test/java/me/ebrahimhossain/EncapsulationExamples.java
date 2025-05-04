package me.ebrahimhossain;

public class EncapsulationExamples {

    private String accountNumber;
    protected double balance;
    public String name;
    String branch;

    //Constructor
    public EncapsulationExamples(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static void main(String[] args) {
        EncapsulationExamples example = new EncapsulationExamples("1212113232", 1220.6556);
        System.out.println("Account Number: " + example.accountNumber);


    }
}
