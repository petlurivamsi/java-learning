package methodChaining;

public class Main {
    public static void main(String[] args) {
        String name="                            remove                       ";

        name = name.concat("      space    ").toUpperCase().trim();
        System.out.println(name);

    }
}
