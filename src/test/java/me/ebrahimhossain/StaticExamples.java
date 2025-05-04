package me.ebrahimhossain;

public class StaticExamples {

    public static void example1() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        System.out.println("Main Program.........");
        example1();
    }

    static{
        System.out.println("static block");
    }
}
