package javaconcepts.inheritanceEx1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.go();

        Bycycle bike = new Bycycle();
        bike.stop();

        System.out.println("The car speed is "+car.speed);
        System.out.println("The bike speed is "+bike.speed);
        System.out.println("The car doors are "+car.doors);
        System.out.println("The bike pedals are "+bike.pedals);
    }
}
