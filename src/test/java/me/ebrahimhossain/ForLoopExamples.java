package me.ebrahimhossain;

public class ForLoopExamples {
    public static void main(String[] args) {
        for(int i = 1; i<10; i++){
            System.out.println("i = " + i);
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        /*
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for(int number : numbers){
            System.out.println("Count: "+number);
        }

         */

        for(int number : numbers){
            if(number % 2 == 0){
                System.out.println(number);
            }
        }

    }
}
