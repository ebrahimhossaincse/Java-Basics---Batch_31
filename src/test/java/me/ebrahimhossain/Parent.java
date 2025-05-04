package me.ebrahimhossain;

public class Parent extends MethodExamples{

    String name = "Test";
    int age = 20;
    String gender = "Male";
    String address = "Test";

    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        System.out.println("Parent Class");
    }
}
