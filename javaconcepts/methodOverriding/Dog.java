package javaconcepts.methodOverriding;

public class Dog extends Animal{
    @Override
    void speak(){//Overriding method
        System.out.println("The dog is speaking...");
    } 
}
