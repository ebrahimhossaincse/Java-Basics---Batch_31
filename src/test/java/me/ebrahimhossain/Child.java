package me.ebrahimhossain;

public class Child extends Parent {

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("A : "+a);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.sum(10,30);
        sub(20,10);
    }
}
