package javaconcepts.inheritanceex.inheritanceexample;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.go();

        Bicycle bike = new Bicycle();

        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);
    }
}
