package javaconcepts.arrayOfObjects;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        char[] characters = new char[3];
        String[] strings = new String[3];
        
        Food[] refridgirator = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Maggi");
        Food food3 = new Food("Burger");

        Food[] items = {food1,food2,food3};
        refridgirator[0] = food1;
        refridgirator[1] = food2;
        refridgirator[2] = food3;

        System.out.println(refridgirator[0].name);
        System.out.println(refridgirator[1].name);
        System.out.println(refridgirator[2].name);
        System.out.println(items[0].name);
        System.out.println(items[1].name);
        System.out.println(items[2].name);
    }
}
