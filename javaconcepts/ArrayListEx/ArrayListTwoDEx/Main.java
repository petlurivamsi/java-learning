package javaconcepts.ArrayListEx.ArrayListTwoDEx;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("Noodles");
        food.add("maggi");

       
        ArrayList<String> bakeryItems = new ArrayList<String>();
        bakeryItems.add("Pasta");
        bakeryItems.add("Garlic bread");
        bakeryItems.add("Dounuts");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("Tomato");
        produceList.add("Oberguino");
        produceList.add("Pepper");

        ArrayList<String> drinksList = new ArrayList<String>();

        drinksList.add("Soda");
        drinksList.add("coffee");

        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();

        groceryList.add(bakeryItems);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);

        System.out.println(groceryList.get(0).get(0));



        
    }    

}
