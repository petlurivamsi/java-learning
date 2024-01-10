package javaconcepts.ConstructorsExamples;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Vamsi",28,89.5);
        Human human2 = new Human("Prakash",27,76.5);
        System.out.println(human1.name);
        System.out.println(human2.name);
        human1.eat();
        human2.eat();
        human1.drink();
        human2.drink();
    }
}
