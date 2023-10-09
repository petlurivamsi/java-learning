package javaconcepts.methods.methodsexample;

public class Main {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(add(a,b));
        printName("Rajesh");

    }

    static void printName(String name){
        System.out.println(name);
    }
    static int add(int x,int y){
        return x+y;
    }
}
