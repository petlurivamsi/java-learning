package javaconcepts.encapsulationex.encapsulationex;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Chervolet","Camaro",2021);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setYear(2023);
        car.setMake("Hundai");
        car.setModel("Santro");
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
