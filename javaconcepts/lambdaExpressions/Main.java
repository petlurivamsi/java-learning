package lambdaExpressions;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car() {
            public void drive(){
                System.out.println("Driving bmw");
            }
        };
        c1.drive();

        // Car c2 = new Car() {
        //     public void drive(){
        //         System.out.println("Driving tata");
        //     }
        // };
        // c2.drive();

        Car c2= ()->{System.out.println("Driving tata");};
        c2.drive();

        Audi a = new Audi();
        a.drive();
    }
}

