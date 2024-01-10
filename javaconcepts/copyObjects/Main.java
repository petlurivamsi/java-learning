package javaconcepts.copyObjects;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Chervolet","Camaro",2021);
        // Car car2 = new Car("Ford","Mustang",2022);
        Car car2 = new Car(car1);
        // car2.copy(car1);
        System.out.println(car1);
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        // car2.setYear(2023);
        // car2.setMake("Hundai");
        // car2.setModel("Santro");
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}
