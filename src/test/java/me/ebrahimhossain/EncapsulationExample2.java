package me.ebrahimhossain;

public class EncapsulationExample2 extends EncapsulationExamples{

    public EncapsulationExample2(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void check(){
        setAccountNumber("1223123");
        System.out.println(getAccountNumber());
        System.out.println(name);
        System.out.println(branch);
        System.out.println(balance);
    }

    public static void main(String[] args) {

    }
}
