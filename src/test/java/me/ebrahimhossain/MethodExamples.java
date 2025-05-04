package me.ebrahimhossain;

public class MethodExamples {
    /*

    Static -> Static Direct Access, Non Static Access - Must Need a Object
    Non Static -> All Static and Non-Static can access without object
     */

    int a = 10;
    static int b = 20;

    public void mul(){
        int c = a * b;
    }

    public void sum(int a, int b) {
        int sum = a + b;
        System.out.println("Summation: "+sum);
    }

    public static void sub(int d, int b) {
        int sub = d - b;
        System.out.println("Subtraction: "+sub);
        MethodExamples obj = new MethodExamples();
        int c = obj.a * b;
    }

    public static void main(String[] args) {
        sub(19, 2);

        //ClassName object name = new ClassName();
        MethodExamples obj = new MethodExamples();
        obj.sum(20, 50);

    }
}
