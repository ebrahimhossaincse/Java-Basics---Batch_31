package me.ebrahimhossain;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        // ArrayList<DataType> name = new ArrayList<DT>();
        ArrayList<String> names = new ArrayList<>();

        System.out.println("ArrayList: " + names);
        System.out.println("ArrayList Size: " + names.size());

        //ADD
        names.add("Sazid");
        names.add("Zakaria");
        names.add("Mysha");
        names.add("Misrat");
        names.add("Samira");

        System.out.println("ArrayList: " + names);
        System.out.println("ArrayList Size: " + names.size());
        System.out.println("Is ArrayList Empty? " + names.isEmpty());
        System.out.println("Index-2: " + names.get(2));

        names.remove("Sazid");
        System.out.println("ArrayList: " + names);
        //names.clear();
        //System.out.println("ArrayList: " + names);

        for (String name : names) {
            System.out.println(name);
        }

    }
}
