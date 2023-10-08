package javaconcepts.forEach.forEachEx;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] animals = {"Cat","Dog","Rabbit","Lion"};

        for(String i:animals){
            System.out.println(i);
        }

        ArrayList<String> animalsAL = new ArrayList<String>();

        animalsAL.add("Cat");
        animalsAL.add("Dog");
        animalsAL.add("Rabbit");
        animalsAL.add("Lion");

        for(String i:animals){
            System.out.println(i);
        }

    }
}
