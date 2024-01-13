package hashMapEx;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String,String> countries = new HashMap<String,String>();
        //adding key value pairs
        countries.put("USA","Washington DC");
        countries.put("India","New Delhi");
        countries.put("China","Beijing");

        // display the countries

        System.out.println("countries are displayed below:");
        System.out.println(countries);

        // Remove a country from hashmap

        countries.remove("USA");
        System.out.println(countries);

        System.out.println(countries.get("India"));

        // countries.clear();

        System.out.println(countries.size());

        countries.replace("China", "Hong Kong");
        System.out.println(countries);
        countries.put("China", "Hong Kong");
        System.out.println(countries);

        System.out.println(countries.containsKey("China"));
        System.out.println(countries.containsKey("England"));
        System.out.println(countries.containsValue("New Delhi"));

        for(String i : countries.keySet()){
            System.out.print(i+"\t = ");
            System.out.println(countries.get(i));
        }
    }
}
