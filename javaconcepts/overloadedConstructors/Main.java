package javaconcepts.overloadedConstructors;

public class Main {
    public static void main(String[] args) {
        Pizza dominos = new Pizza("thicc crust","tomato","mozzerella","pepporoni");
        Pizza pizzaHut = new Pizza("thicc pizza crust","chilli","swiss");
        Pizza veganPizza = new Pizza("baked vegan", "Zalapeno");
        Pizza subwayPizza = new Pizza("baked bread");

        System.out.println("Here are the ingredients of your pizza::");
        System.out.println(dominos.bread);
        System.out.println(dominos.sauce);
        System.out.println(dominos.cheese);
        System.out.println(dominos.topping);
        System.out.println(pizzaHut.bread);
        System.out.println(pizzaHut.sauce);
        System.out.println(pizzaHut.cheese);
         System.out.println(veganPizza.bread);
        System.out.println(veganPizza.sauce);
        System.out.println(subwayPizza.sauce);

    }
}
