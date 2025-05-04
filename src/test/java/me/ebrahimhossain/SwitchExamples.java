package me.ebrahimhossain;

public class SwitchExamples {
    public static void main(String[] args) {
        int x = 9;

        switch (x) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Friday");
                break;
        }
    }
}
