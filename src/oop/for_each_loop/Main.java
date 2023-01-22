package oop.for_each_loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>(Arrays.asList("Cat", "Mouse", "Dog", "Lizard", "Snake"));

        System.out.println("Printing with for loop...");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        System.out.println("");

        System.out.println("Printing with for each loop...");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("");
    }
}
