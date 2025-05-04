package me.ebrahimhossain;

import java.util.Scanner;

public class UsersInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //String name;
        /*

         System.out.println("Please enter a integer number: ");
        int number = input.nextInt();

        System.out.println("Please enter a boolean: ");
        boolean bool = input.nextBoolean();

        System.out.println("Please enter a string: ");
        String name = input.nextLine();

         */

        System.out.println("Please enter a integer number: ");
        int number = input.nextInt();

        System.out.println("Please enter a boolean: ");
        boolean bool = input.nextBoolean();

        System.out.println("Please enter a string: ");
        String name = input.nextLine();

        System.out.println("Number is: " + number);
        System.out.println("Name is: " + name);
        System.out.println("Bool is: " + bool);
    }
}
