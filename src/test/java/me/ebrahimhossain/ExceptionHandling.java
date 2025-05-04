package me.ebrahimhossain;

public class ExceptionHandling {
    public static void main(String[] args) {

        try{
            int a = 10;
            int b = 2;
            System.out.println(a / b);
        }catch(Exception e){
            System.out.println("Number can't be divisible by zero");
        }


    }
}
