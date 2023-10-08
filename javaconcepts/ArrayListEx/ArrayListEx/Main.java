package javaconcepts.ArrayListEx.ArrayListEx;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("Noodles");
        food.add("maggi");

        for(int i=0;i<food.size();i++){//for arraylist use size
            System.out.println(food.get(i));
        }
    }    

}
