package javaconcepts.MethodOverloading.MethodOverloadingEx;

public class Main {
    public static void main(String[] args) {
        int sum1 = add(1,2);
        System.out.println("Sum1 value is "+sum1);
        int sum2 = add(1,2,3);
        System.out.println("Sum2 value is "+sum2);

        int sum3 = add(1,2,3,4);
        System.out.println("Sum3 value is "+sum3);

        System.out.println("The values are "+sum1+" "+sum2+" "+sum3);

    }

    static int add(int a,int b){
        System.out.println("method#1 with two parameters ");
        return a+b;
    }
    static int add(int a,int b,int c){
        System.out.println("method#2 with three parameters ");
        return a+b+c;
    }
    static int add(int a,int b,int c,int d){
        System.out.println("method#3 with four parameters ");
        return a+b+c+d;
    }

}